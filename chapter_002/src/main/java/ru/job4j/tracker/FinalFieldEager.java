package ru.job4j.tracker;

public class FinalFieldEager {
    private static final FinalFieldEager INSTANCE = new FinalFieldEager();

    private FinalFieldEager() {
        }

    public static FinalFieldEager getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
