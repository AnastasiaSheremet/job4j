package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String inputId = input.askStr("Input item id:");
        if (tracker.delete(inputId)) {
            System.out.println("Item has been deleted.");
        } else {
            System.out.println("Item has not been deleted.");
        }
    }
}
