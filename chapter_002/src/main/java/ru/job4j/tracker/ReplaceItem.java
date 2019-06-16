package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Input id:");
        System.out.println("------------ Create new item --------------");
        String name = input.ask("Input item name :");
        String desc = input.ask("Input item description :");
        Item item = new Item(name, desc);
        item.setId(id);
        tracker.replace(id, item);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item.");
    }
}
