package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return 4;
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

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Find item by Id.");
    }
}