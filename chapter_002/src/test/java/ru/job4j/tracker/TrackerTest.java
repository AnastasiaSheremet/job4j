package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {
//    @Test
//    public void whenAddNewItemThenTrackerHasSameItem() {
//        Tracker tracker = new Tracker();
//        long created = System.currentTimeMillis();
//        Item item = new Item("test1","testDescription", created);
//        tracker.add(item);
//        Item result = tracker.findById(item.getId());
//        assertThat(result.getName(), is(item.getName()));
//    }
//
//    @Test
//    public void whenReplaceNameThenReturnNewName() {
//        Tracker tracker = new Tracker();
//        Item previous = new Item("test1","testDescription",123L);
//        tracker.add(previous);
//        Item next = new Item("test2","testDescription2",1234L);
//        next.setId(previous.getId());
//        tracker.replace(previous.getId(), next);
//        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
//    }
//
//    @Test
//    public void whenDeleteNameThenReturnNextName() {
//        Tracker tracker = new Tracker();
//        Item previous = new Item("test1","testDescription",123L);
//        Item next = new Item("test2","testDescription",1234L);
//        tracker.add(previous);
//        tracker.add(next);
//        tracker.delete(previous.getId());
//        next.setId(previous.getId());
//        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
//    }
//
//    @Test
//    public void whenFindAllThenRerurnArrayOfAll() {
//        Tracker tracker = new Tracker();
//        Item first = new Item("test1","testDescription",123L);
//        Item second = new Item("test2","testDescription",1234L);
//        tracker.add(first);
//        tracker.add(second);
//        Item[] result = tracker.findAll();
//        Item[] expect = {first, second};
//        assertThat(result, arrayContainingInAnyOrder(expect));
//    }
//
//    @Test
//    public void whenFindByNameThenRerurnItemsWhisThisName() {
//        Tracker tracker = new Tracker();
//        Item first = new Item("test1","testDescription",123L);
//        Item second = new Item("test2","testDescription",1234L);
//        Item third = new Item("test1","testDescription",154L);
//        tracker.add(first);
//        tracker.add(second);
//        tracker.add(third);
//        Item[] result = tracker.findByName("test1");
//        Item[] expect = {first, third};
//        assertThat(result, arrayContainingInAnyOrder(expect));
//    }
//
//    @Test
//    public void whenFindByIdThenReturnItemWhisThisId() {
//        Tracker tracker = new Tracker();
//        Item first = new Item("test1","testDescription",123L);
//        Item second = new Item("test2","testDescription",1234L);
//        tracker.add(first);
//        tracker.add(second);
//        Item result = tracker.findById(second.getId());
//        assertThat(result, is(second));
//    }
}