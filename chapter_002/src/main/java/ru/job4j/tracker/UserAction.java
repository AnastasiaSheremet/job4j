package ru.job4j.tracker;

public interface UserAction {
    /**
     * @return key of the option.
     */
    int key();

    /**
     * @param input of the class Input.
     * @param tracker of the class Tracker.
     */
    void execute(Input input, Tracker tracker);

    /**
     * @return info about menu item.
     */
    String info();
}
