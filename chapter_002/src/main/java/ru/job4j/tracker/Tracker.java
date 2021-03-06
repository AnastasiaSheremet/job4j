package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private List<Item> items = new ArrayList<>();
//    private int position = 0;
    private static final Random RANDOM = new Random();

    /**
     * This method adds items.
     * @param item item.
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * This method generates id.
     * @return id.
     */
    private String generateId() {
        return String.valueOf(RANDOM.nextInt(100) + System.currentTimeMillis());
    }


    /**
     * This method replaces items.
     * @param id item id.
     * @param item item.
     * @return true or false.
     */
    public boolean replace(String id, Item item) {
        boolean repl = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.set(i, item);
                repl = true;
                break;
            }
        }
        return repl;
    }

    /**
     * This method deletes items.
     * @param id item id.
     * @return true or false.
     */
    public boolean delete(String id) {
        boolean del = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                del = true;
                break;
            }
        }
        return del;
    }

     /**
     * This method fins all items.
     * @return  Item[].
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * This method finds items by name.
     * @param key item key.
     * @return Item[];
     */
    public List<Item> findByName(String key) {
        List<Item> itemsNew = new ArrayList<>();
        for (Item i : items) {
            if ((i != null) && i.getName().equals(key)) {
                itemsNew.add(i);
            }
        }
        return itemsNew;
    }

    public Item findById(String id) {
        Item item = null;
        for (Item i : items) {
            if ((i != null) && (i.getId().equals(id))) {
                item = i;
                break;
            }
        }
        return item;
    }

    @Override
    public String toString() {
        return "Tracker{"
                + "items=" + items
                + '}';
    }
}