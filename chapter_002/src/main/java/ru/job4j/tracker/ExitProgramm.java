package ru.job4j.tracker;

public class ExitProgramm implements UserAction {
    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.exit(0);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Exit Program.");
    }


}
