package ru.job4j.tracker;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class
 */

public class StartUITest {
    private Tracker tracker = new Tracker();     // создаём Tracker

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    private String getMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Menu.");
        menu.append("    0 - Add new item.");
        menu.append("    1 - Show all items.");
        menu.append("    2 - Edit item.");
        menu.append("    3 - Delete item.");
        menu.append("    4 - Find item by Id.");
        menu.append("    5 - Find items by name.");
        menu.append("    6 - Exit program.");
        menu.append("Select a menu item :");
        return menu.toString();
    }


    @Test
        public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
            Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
            new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
            Assert.assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        }

        @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasNotDeletedValue() {
        //Directly add Item
        Item item = tracker.add(new Item("test name", "desc"));
        //create StubInput with item deletion
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        // create StartUI and call init()
        new StartUI(input, tracker).init();
        // check that item is deleted
        assertThat(tracker.findAll(), arrayContainingInAnyOrder());
    }

    @Test
    public void whenShowAll() {
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"3", "6"});
        StringBuilder expected = new StringBuilder();
        expected.append(this.getMenu())
                .append(String.format("[Item{id='%s', name='test name', desc='desc', time=0}]", item.getId()))
                .append(this.getMenu());
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(expected.toString()));
    }

    @Test
    public void whenShowAllWithNothing() {
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"3", "6"});
        StringBuilder expected = new StringBuilder();
        expected.append(this.getMenu())
                .append("[]")
                .append(this.getMenu());
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(expected.toString()));
    }
}
