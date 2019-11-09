package ru.job4j.tracker;

public class FindItemById extends BaseAction {

    public FindItemById(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputId = input.askStr("Input item id:");
        Item item = tracker.findById(inputId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Nothing");
        }
    }
}