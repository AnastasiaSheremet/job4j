package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void whenDifferenAge() {
        SortUser sUser = new SortUser();
        User yangest = new User("Ivan", 17);
        User middle = new User("Sergey", 32);
        User oldest = new User("Andrey", 48);
        List<User> list = new ArrayList<>();
        list.add(middle);
        list.add(yangest);
        list.add(oldest);
        Set<User> result = sUser.sort(list);
        Set<User> expect = new TreeSet<>();
        expect.add(yangest);
        expect.add(middle);
        expect.add(oldest);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSameAge() {
        SortUser sUser = new SortUser();
        User yangest = new User("Ivan", 17);
        User middle = new User("Sergey", 17);
        User oldest = new User("Andrey", 48);
        List<User> list = new ArrayList<>();
        list.add(middle);
        list.add(yangest);
        list.add(oldest);
        Set<User> result = sUser.sort(list);
        Set<User> expect = new TreeSet<>();
        expect.add(yangest);
        expect.add(middle);
        expect.add(oldest);
        assertThat(result, is(expect));
    }
}
