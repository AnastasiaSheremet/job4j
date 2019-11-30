package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is("test1"));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteNameThenReturnNextName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        Item next = new Item("test2", "testDescription");
        tracker.add(previous);
        tracker.add(next);
        tracker.delete(previous.getId());
        next.setId(previous.getId());
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFindAllThenRerurnArrayOfAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription");
        tracker.add(first);
        tracker.add(second);
        Item[] result = tracker.findAll().toArray(new Item[2]);
        Item[] expect = {first, second};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindByNameThenRerurnItemsWhisThisName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription");
        Item third = new Item("test1", "testDescription");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] result = tracker.findByName("test1").toArray(new Item[2]);
        Item[] expect = {first, third};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindByIdThenReturnItemWhisThisId() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription");
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findById(second.getId());
        assertThat(result, is(second));
    }
}