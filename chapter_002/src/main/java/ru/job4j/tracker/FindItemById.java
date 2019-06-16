package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputId = input.ask("Input item id:");
        System.out.println(tracker.findById(inputId));
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Find item by Id.");
    }
}
