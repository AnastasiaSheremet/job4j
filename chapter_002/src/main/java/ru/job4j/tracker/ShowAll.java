package ru.job4j.tracker;

import java.util.Arrays;

public class ShowAll implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println(Arrays.toString(tracker.findAll()));
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Show all items.");
    }
}
