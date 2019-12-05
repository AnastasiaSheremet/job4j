package ru.job4j.sort;

import org.junit.Test;

import java.lang.reflect.Array;
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
        Set<User> expect = new HashSet<>();
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
        Set<User> expect = new HashSet<>();
        expect.add(yangest);
        expect.add(middle);
        expect.add(oldest);
        assertThat(result, is(expect));
    }

    public void whenNameLengsSort() {
        SortUser sUser = new SortUser();
        User shortest = new User("Ivan", 17);
        User longest = new User("Sergey", 17);
        User middle = new User("Pavel", 48);
        List<User> list = new ArrayList<>();
        list.add(middle);
        list.add(longest);
        list.add(shortest);
        List<User> result = sUser.sortNameLength(list);
        List<User> expect = new ArrayList<>();
        expect.add(shortest);
        expect.add(middle);
        expect.add(longest);
        assertThat(result, is(expect));
    }

    public void whenAllFieldsSort() {
        SortUser sUser = new SortUser();
        User first = new User("Pavel", 17);
        User second = new User("Ivan", 27);
        User third = new User("Pavel", 48);
        List<User> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        List<User> result = sUser.sortNameLength(list);
        List<User> expect = new ArrayList<>();
        expect.add(second);
        expect.add(first);
        expect.add(third);
        assertThat(result, is(expect));
    }
}
