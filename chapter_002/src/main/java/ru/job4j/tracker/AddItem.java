package ru.job4j.tracker;

public class AddItem extends BaseAction {

   public AddItem(int key, String name) {
       super(key, name);
   }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item --------------");
        String name = input.askStr("Input item name :");
        String desc = input.askStr("Input item description :");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println(item);
    }
}
