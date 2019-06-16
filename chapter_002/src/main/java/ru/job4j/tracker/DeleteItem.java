package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputId = input.ask("Input item id:");
        System.out.println(tracker.delete(inputId));
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Delete item.");
    }
}
