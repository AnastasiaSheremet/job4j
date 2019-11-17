package ru.job4j.tracker;

public enum EnumEagerLoading {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
