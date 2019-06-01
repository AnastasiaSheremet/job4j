package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class
 */

public class StartUITest {
        @Test
        public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
            Tracker tracker = new Tracker();     // создаём Tracker
            Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
            new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
            Assert.assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        }

        @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
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
        // create Tracker
        Tracker tracker = new Tracker();
        //Directly add Item
        Item item = tracker.add(new Item("test name", "desc"));
        //create StubInput with item deletion
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        // create StartUI and call init()
        new StartUI(input, tracker).init();
        // check that item is deleted
        assertThat(tracker.findAll(), arrayContainingInAnyOrder());
    }
}
