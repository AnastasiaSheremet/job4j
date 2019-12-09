package ru.job4j.comporator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int compareLength = Integer.compare(o2.length(), o2.length());
        if (compareLength == 0) {
            for (int i = 0; i < o1.length(); i++) {
                result = Character.compare(o1.charAt(i), o2.charAt(i));
                if (result != 0) {
                    break;
                }
            }
        } else {
            result = compareLength;
        }
        return result;
    }
}
