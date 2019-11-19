package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SingletonTest {

    @Test
    public void enumEagerLoadingTest() {
        EnumEagerLoading first = EnumEagerLoading.INSTANCE;
        EnumEagerLoading second = EnumEagerLoading.INSTANCE;
        assertSame(first, second);
    }

    @Test
    public void staticFieldLazyTest() {
        StaticFieldLazy first = StaticFieldLazy.getInstance();
        StaticFieldLazy second = StaticFieldLazy.getInstance();
        assertSame(first, second);
    }

    @Test
    public void finalFieldEagerTest() {
        FinalFieldEager first = FinalFieldEager.getInstance();
        FinalFieldEager second = FinalFieldEager.getInstance();
        assertSame(first, second);
    }

    @Test
    public void staticFinalClassLazyTest() {
        StaticFinalClassLazy first = StaticFinalClassLazy.getInstance();
        StaticFinalClassLazy second = StaticFinalClassLazy.getInstance();
        assertSame(first, second);
    }
}
