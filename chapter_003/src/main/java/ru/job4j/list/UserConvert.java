package ru.job4j.list;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> covertResult = new HashMap<>();
        for (User user : list) {
            covertResult.put(user.getId(), user);
        }
        return covertResult;
    }
}
