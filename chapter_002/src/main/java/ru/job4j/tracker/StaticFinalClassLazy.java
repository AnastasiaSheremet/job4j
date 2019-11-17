package ru.job4j.tracker;

public class StaticFinalClassLazy {
    private StaticFinalClassLazy() {
        }

    public static StaticFinalClassLazy getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final StaticFinalClassLazy INSTANCE = new StaticFinalClassLazy();
    }
}
