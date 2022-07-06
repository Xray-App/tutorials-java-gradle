package app.getxray.java;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalcTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void CanAddNumbers()
    {
        assertThat(Calculator.add(1, 1), is(2));
        assertThat(Calculator.add(-1, 1), is(2));
    }

    @Test
    public void CanSubtract()
    {
        assertThat(Calculator.subtract(1, 1), is(0));
        assertThat(Calculator.subtract(-1, -1), is(0));
        assertThat(Calculator.subtract(100, 5), is(95));
    }

    @Test
    public void CanMultiply()
    {
        assertThat(Calculator.multiply(1, 1), is(1));
        assertThat(Calculator.multiply(-1, -1), is(1));
        assertThat(Calculator.multiply(100, 5), is(500));
    }

    public void CanDivide()
    {
        assertThat(Calculator.divide(1, 1), is(1));
        assertThat(Calculator.divide(-1, -1), is(1));
        assertThat(Calculator.divide(100, 5), is(20));
    }

    @Test
    public void CanDoStuff()
    {
        assertThat(true, is(true));
    }

}
