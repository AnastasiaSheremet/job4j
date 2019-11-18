package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SingletonTest {

    @Test
    public void enumEagerLoadingTest() {
        EnumEagerLoading first = EnumEagerLoading.INSTANCE;
        EnumEagerLoading second = EnumEagerLoading.INSTANCE;
        boolean compare = first == second;
        assertThat(compare, is(true));
    }

    @Test
    public void staticFieldLazyTest() {
        StaticFieldLazy first = StaticFieldLazy.getInstance();
        StaticFieldLazy second = StaticFieldLazy.getInstance();
        boolean compare = first == second;
        assertThat(compare, is(true));
    }

    @Test
    public void finalFieldEagerTest() {
        FinalFieldEager first = FinalFieldEager.getInstance();
        FinalFieldEager second = FinalFieldEager.getInstance();
        boolean compare = first == second;
        assertThat(compare, is(true));
    }

    @Test
    public void staticFinalClassLazyTest() {
        StaticFinalClassLazy first = StaticFinalClassLazy.getInstance();
        StaticFinalClassLazy second = StaticFinalClassLazy.getInstance();
        boolean compare = first == second;
        assertThat(compare, is(true));
    }
}
