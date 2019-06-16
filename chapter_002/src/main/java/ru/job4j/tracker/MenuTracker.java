package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
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
        this.actions.add(new AddItem());
        this.actions.add(new ShowAll());
        this.actions.add(new ReplaceItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindItemById());
        this.actions.add(new FindItemByName());
        this.actions.add(new ExitProgramm());
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
        for (UserAction action : actions){
            if (action != null){
                System.out.println(action.info());
            }
        }
    }


}
