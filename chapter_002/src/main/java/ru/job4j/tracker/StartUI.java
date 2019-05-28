package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private static final String ADD_ITEM = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_BY_ID = "4";
    private static final String FIND_BY_NAME = "5";
    private static final String EXIT = "6";
    private final Tracker tracker;
    private final Input input;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

     public void init() {
         boolean exit = false;
         String inputId;
         while (!exit) {
             this.showMenu();
             String answer = this.input.ask("Select a menu item : ");
             switch (answer) {
                 case (ADD_ITEM):
                     this.createItem();
                     break;
                 case (SHOW_ALL):
                     this.showAll();
                     break;
                 case (EDIT):
                     this.replaceItem();
                     break;
                 case (DELETE):
                     this.dleteItem();
                     break;
                 case (FIND_BY_ID):
                     this.findItemById();
                     break;
                 case (FIND_BY_NAME):
                     this.findItemByName();
                     break;
                 case (EXIT):
                     exit = true;
                     break;
                 default:
                     System.out.println("Incorrect input. Try again.");
                     break;
             }
         }
     }

     private void createItem() {
        System.out.println("------------ Adding new item --------------");
        String name = this.input.ask("Input item name :");
        String desc = this.input.ask("Input item description :");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("------------ New item with getId : " + item.getId() + "-----------");
        }

    private void replaceItem() {
        String id = this.input.ask("Input id:");
        System.out.println("------------ Create new item --------------");
        String name = this.input.ask("Input item name :");
        String desc = this.input.ask("Input item description :");
        Item item = new Item(name, desc);
        item.setId(id);
        tracker.replace(id, item);
        }

    private void  showAll() {
            System.out.println(Arrays.toString(tracker.findAll()));
        }

    private void dleteItem() {
        String inputId = this.input.ask("Input item id:");
        System.out.println(tracker.delete(inputId));
    }

    private void findItemById() {
        String inputId = this.input.ask("Input item id:");
        System.out.println(tracker.findById(inputId));
    }

    private void findItemByName() {
        String inputName = this.input.ask("Input item name:");
        System.out.println(Arrays.toString(tracker.findByName(inputName)));
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("    0 - Add new item.");
        System.out.println("    1 - Show all items.");
        System.out.println("    2 - Edit item.");
        System.out.println("    3 - Delete item.");
        System.out.println("    4 - Find item by Id.");
        System.out.println("    5 - Find items by name.");
        System.out.println("    6 - Exit program.");
    }
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
