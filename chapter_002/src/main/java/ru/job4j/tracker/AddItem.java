package ru.job4j.tracker;

public class AddItem implements UserAction {

    @Override
    public int key() {
        return 0;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item --------------");
        String name = input.askStr("Input item name :");
        String desc = input.askStr("Input item description :");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println(item);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Add new item.");
    }
}
