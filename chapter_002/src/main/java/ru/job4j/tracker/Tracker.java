package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
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
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
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
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                System.arraycopy(items, i + 1, items, i, position - i - 1);
                items[position - 1] = null;
                position--;
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
        return Arrays.copyOf(items, position);
    }

    /**
     * This method finds items by name.
     * @param key item key.
     * @return Item[];
     */
    public Item[] findByName(String key) {
        Item[] itemsNew = new Item[items.length];
        int pos = 0;
        for (int i = 0; i < position; i++) {
            if ((items[i] != null) && items[i].getName().equals(key)) {
                itemsNew[pos++] = items[i];
            }
        }
        return Arrays.copyOf(itemsNew, pos);
    }

    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < position; i++) {
            if ((items[i] != null) && (items[i].getId().equals(id))) {
                item = items[i];
                break;
            }
        }
        return item;
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "items=" + Arrays.toString(items) +
                ", position=" + position +
                '}';
    }
}
