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
        if (tracker.replace(id, item)) {
            System.out.println("Item has been replaced");
        }else {
            System.out.println("Not done");
        }
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item.");
    }
}
