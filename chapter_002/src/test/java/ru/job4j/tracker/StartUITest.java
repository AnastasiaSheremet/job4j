package ru.job4j.tracker;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

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
    private final Consumer<String> output = new Consumer<String>(){
        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }
    };

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
        menu.append("Menu.").append(System.lineSeparator());
        menu.append("    0 - Add new item.").append(System.lineSeparator());
        menu.append("    1 - Show all items.").append(System.lineSeparator());
        menu.append("    2 - Edit item.").append(System.lineSeparator());
        menu.append("    3 - Delete item.").append(System.lineSeparator());
        menu.append("    4 - Find item by Id.").append(System.lineSeparator());
        menu.append("    5 - Find items by name.").append(System.lineSeparator());
        menu.append("    6 - Exit program.").append(System.lineSeparator());
//        menu.append("Select a menu item :").append(System.lineSeparator());
        return menu.toString();
    }


    @Test
        public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
            Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
            new StartUI(input, tracker, System.out::println).init();     //   создаём StartUI и вызываем метод init()
            Assert.assertThat(this.output.toString(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        }

//        @Test
//    public void whenUpdateThenTrackerHasUpdatedValue() {
//        //Напрямую добавляем заявку
//        Item item = tracker.add(new Item("test name", "desc"));
//        //создаём StubInput с последовательностью действий(производим замену заявки)
//        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
//        // создаём StartUI и вызываем метод init()
//        new StartUI(input, tracker, System.out::println).init();
//        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
//        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
//    }
//
//    @Test
//    public void whenDeleteThenTrackerHasNotDeletedValue() {
//        //Directly add Item
//        Item item = tracker.add(new Item("test name", "desc"));
//        //create StubInput with item deletion
//        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
//        // create StartUI and call init()
//        new StartUI(input, tracker, System.out::println).init();
//        // check that item is deleted
//        assertThat(tracker.findAll(), arrayContainingInAnyOrder());
//    }
//
//    @Test
//    public void whenShowAll() {
//        Item item = tracker.add(new Item("test name", "desc"));
//        Input input = new StubInput(new String[]{"1", "6"});
//        StringBuilder expected = new StringBuilder();
//        expected.append(this.getMenu())
//                .append(String.format("[Item{id='%s', name='test name', desc='desc', time=0}]", item.getId())).append(System.lineSeparator())
//                .append(this.getMenu());
//        new StartUI(input, tracker, System.out::println).init();
//        assertThat(new String(out.toByteArray()), is(expected.toString()));
//    }
//
//    @Test
//    public void whenShowAllWithNothing() {
//        Input input = new StubInput(new String[]{"1", "6"});
//        StringBuilder expected = new StringBuilder();
//        expected.append(this.getMenu())
//                .append("[]").append(System.lineSeparator())
//                .append(this.getMenu());
//        new StartUI(input, tracker, System.out::println).init();
//        assertThat(new String(out.toByteArray()), is(expected.toString()));
//    }
//
//    @Test
//    public void whenFindByName() {
//        Item item = tracker.add(new Item("test name", "desc"));
//        Item item1 = tracker.add(new Item("test name 1", "desc1"));
//        Item item2 = tracker.add(new Item("test name 2", "desc2"));
//        Input input = new StubInput(new String[]{"5", "test name 1", "6"});
//        StringBuilder expected = new StringBuilder();
//        expected.append(this.getMenu())
//                .append(String.format("[Item{id='%s', name='test name 1', desc='desc1', time=0}]", item1.getId())).append(System.lineSeparator())
//                .append(this.getMenu());
//        new StartUI(input, tracker).init();
//        assertThat(new String(out.toByteArray()), is(expected.toString()));
//    }
//
    @Test
    public void whenFindById() {
        Item item = tracker.add(new Item("test name", "desc"));
        Item item1 = tracker.add(new Item("test name 1", "desc1"));
        Item item2 = tracker.add(new Item("test name 2", "desc2"));
        Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
        StringBuilder expected = new StringBuilder();
        expected.append(this.getMenu())
                .append(String.format("Item{id='%s', name='test name 1', desc='desc1', time=0}", item1.getId())).append(System.lineSeparator())
                .append(this.getMenu());
        new StartUI(input, tracker, System.out::println).init();
        assertThat(this.output.toString(), is(expected.toString()));
    }
}
