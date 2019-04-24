package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 2019.04.22
 */
public class CalculateTest {

    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Anastasia Sheremet";
        String expect = "Echo, echo, echo : Anastasia Sheremet";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}
