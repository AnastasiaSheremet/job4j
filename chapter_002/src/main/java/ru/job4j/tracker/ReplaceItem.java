package ru.job4j.tracker;

public class ReplaceItem extends BaseAction {

    public ReplaceItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.askStr("Input id:");
        System.out.println("------------ Create new item --------------");
        String name = input.askStr("Input item name :");
        String desc = input.askStr("Input item description :");
        Item item = new Item(name, desc);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println("Item has been replaced");
        } else {
            System.out.println("Not done");
        }
    }
}