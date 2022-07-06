package app.getxray.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

import app.getxray.xray.junit.customjunitxml.XrayTestReporter;
import app.getxray.xray.junit.customjunitxml.XrayTestReporterParameterResolver;
import app.getxray.xray.junit.customjunitxml.annotations.Requirement;
import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;

@ExtendWith(XrayTestReporterParameterResolver.class)
public class CalcTest {

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    @XrayTest(key = "CALC-739")
    @Requirement("CALC-740")
    public void CanAddNumbers()
    {
        assertThat(Calculator.add(1, 1), is(2));
        assertThat(Calculator.add(-1, 1), is(2));
    }

    @Test
    @XrayTest(summary = "substraction test", description = "basic integer subtraction test")
    public void CanSubtract(XrayTestReporter xrayReporter)
    {
        // xrayReporter.addTestRunEvidence(screenshot.getAbsolutePath());
        xrayReporter.addComment("some comment");
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

    @Test
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
