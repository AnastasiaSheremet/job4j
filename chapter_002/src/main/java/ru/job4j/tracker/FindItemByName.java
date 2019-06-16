package ru.job4j.tracker;

import java.util.Arrays;

public class FindItemByName implements UserAction {

    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputName = input.ask("Input item name:");
        System.out.println(Arrays.toString(tracker.findByName(inputName)));
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Find items by name.");
    }
}
