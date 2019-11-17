package ru.job4j.tracker;

public class StaticFieldLazy {
    private static StaticFieldLazy instance;

    private StaticFieldLazy() {
            }

    public static StaticFieldLazy getInstance() {
        if (instance == null) {
            instance = new StaticFieldLazy();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
