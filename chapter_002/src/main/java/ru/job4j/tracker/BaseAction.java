package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {
    private final int key;
    private final String name;

    public BaseAction(int key, String name) {
        this.name = name;
        this.key = key;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public String info() {
        return String.format("%s. %s.", this.key, this.name);
    }
}
