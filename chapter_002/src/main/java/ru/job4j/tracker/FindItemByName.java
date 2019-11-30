package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class FindItemByName extends BaseAction {

    public FindItemByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputName = input.askStr("Input item name:");
        List<Item> newItems = tracker.findByName(inputName);
        if (newItems != null) {
            for (Item item : newItems) {
                System.out.println(item);
            }
        } else {
            System.out.println("Nothing");
        }
        //System.out.println(Arrays.toString(tracker.findByName(inputName)));
    }
}