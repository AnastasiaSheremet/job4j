package ru.job4j.tracker;

import java.sql.SQLOutput;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputId = input.ask("Input item id:");
        if (tracker.delete(inputId)) {
            System.out.println("Item has been deleted.");
        }else {
            System.out.println("Item has not been deleted.");
        }
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Delete item.");
    }
}
