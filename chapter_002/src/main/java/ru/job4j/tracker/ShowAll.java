package ru.job4j.tracker;

import java.util.Arrays;

public class ShowAll extends BaseAction {

    public ShowAll(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println(tracker.findAll());
    }
}
