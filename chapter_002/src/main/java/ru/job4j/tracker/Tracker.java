package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private Item[] items = new Item[100];
    private static int position = 0;
    private static final Random random = new Random();

    /**
     * This method adds items.
     * @param item item.
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[position++] = item;
        return item;
    }

    /**
     * This method generates id.
     * @return id.
     */
    private String generateId() {
        return String.valueOf(random.nextInt(100) + System.currentTimeMillis());
    }


    /**
     * This method replaces items.
     * @param id item id.
     * @param item item.
     * @return true or false.
     */
    public boolean replace(String id, Item item) {
        boolean repl = false;
        for (int i = 0; i < items.length; i++) {
            if (this.findById(id) == items[i]) {
                this.items[i] = item;
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
        for (int i = 0; i < items.length; i++) {
            if (this.findById(id) == items[i]) {
                for (int j = i; j < items.length - 1; j++) {
                    items[j] = items[j + 1];
                }
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
    public Item[] findAll() {
        int stop = 0;
        for (int i = 0; i < items.length; i++) {
            if ((items[i] == null) || (i == items.length - 1)) {
                stop = i;
                break;
            }
        }
        return Arrays.copyOf(items, stop);
    }

    /**
     * This method finds items by name.
     * @param key item key.
     * @return Item[];
     */
    public Item[] findByName(String key) {
        Item[] itemsNew = new Item[items.length];
        int pos = 0;
        for (int i = 0; i < items.length; i++) {
            if ((items[i] != null) && items[i].getName().equals(key)) {
                itemsNew[pos++] = items[i];
            }
        }
        return Arrays.copyOf(itemsNew, pos);
    }

    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < items.length; i++) {
            if ((items[i] != null) && (items[i].getId().equals(id))) {
                item = items[i];
                break;
            }
        }
        return item;
    }
}
