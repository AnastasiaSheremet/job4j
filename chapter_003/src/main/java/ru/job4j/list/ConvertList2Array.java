package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public List<Integer> list = new ArrayList<>();

    public List<Integer> fillList() {
        for (Integer index = 0; index <= 7; index++) {
            list.add(index);
        }
        return this.list;
    }

    public int[][] toArray(List<Integer> list, int rows) {
        int cells;
        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = list.size() / rows + 1;
        }
        int[][] array = new int[rows][cells];
        int r = 0;
        int c = 0;
        for (Integer index : list) {
            array[r][c] = index;
            c++;
            if (cells == c) {
                c = 0;
                r++;
            }
        }
        return array;
    }
}
