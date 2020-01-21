package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();
    private Consumer<String> output;

    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    /**
     * Method for getting Menu array.
     * @return array length.
     */
    public int getActionsLength() {
        return this.actions.size();
    }

     /**
     * Method fills array.
     */
    public  void fillActions() {
        this.actions.add(new AddItem(0, "Add Item"));
        this.actions.add(new ShowAll(1, "Show All"));
        this.actions.add(new ReplaceItem(2, "Replace Item"));
        this.actions.add(new DeleteItem(3, "Delete Item"));
        this.actions.add(new FindItemById(4, "Find Item by Id"));
        this.actions.add(new FindItemByName(5, "Find Item by Name"));
        this.actions.add(new ExitProgramm(6, "Exit Programm"));
    }

    /**
     * This method executes actions corresponding to the selected key.
     * @param key of the action.
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Method displays menu.
     */
    public void show() {
        for (UserAction action : actions) {
            if (action != null) {
                output.accept(action.info());
            }
        }
    }
}