package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SingletonTest {

    @Test
    public void enumEagerLoadingTest() {
        EnumEagerLoading first = EnumEagerLoading.INSTANCE;
        EnumEagerLoading second = EnumEagerLoading.INSTANCE;
        assertThat(first.toString(), is(second.toString()));
    }

    @Test
    public void staticFieldLazyTest() {
        StaticFieldLazy first = StaticFieldLazy.getInstance();
        StaticFieldLazy second = StaticFieldLazy.getInstance();
        assertThat(first.toString(), is(second.toString()));
    }

    @Test
    public void finalFieldEagerTest() {
        FinalFieldEager first = FinalFieldEager.getInstance();
        FinalFieldEager second = FinalFieldEager.getInstance();
        assertThat(first.toString(), is(second.toString()));
    }

    @Test
    public void staticFinalClassLazyTest() {
        StaticFinalClassLazy first = StaticFinalClassLazy.getInstance();
        StaticFinalClassLazy second = StaticFinalClassLazy.getInstance();
        assertThat(first.toString(), is(second.toString()));
    }
}
