package app.getxray.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.Reporter;
import org.testng.reporters.XMLReporter;
import org.testng.ITestResult;
import static org.testng.Assert.*;
//import static org.testng.AssertJUnit.*;
import app.getxray.xray.testng.annotations.*;

public class CalcTest {

    @BeforeSuite
    public void setUp() throws Exception {

    }

    @AfterSuite
    public void tearDown() throws Exception {

    }

    @Test
    @XrayTest(key = "CALC-739")
    @Requirement(key = "CALC-740")
    public void CanAddNumbers()
    {
        assertEquals(Calculator.add(1, 1), 2);
        assertEquals(Calculator.add(-1, 1), 2);
    }

    @Test
    @Requirement(key = "CALC-740")
    public void CanSubtract()
    {
        assertEquals(Calculator.subtract(1, 1), 0);
        assertEquals(Calculator.subtract(-1, -1), 0);
        assertEquals(Calculator.subtract(100, 5), 95);
    }

    @Test
    @Requirement(key = "CALC-740")
    public void CanMultiply()
    {
        assertEquals(Calculator.multiply(1, 1), 1);
        assertEquals(Calculator.multiply(-1, -1), 1);
        assertEquals(Calculator.multiply(100, 5), 500);
    }

    @Test
    public void CanDivide()
    {
        assertEquals(Calculator.divide(1, 1), 1);
        assertEquals(Calculator.divide(-1, -1), 1);
        assertEquals(Calculator.divide(100, 5), 20);
    }

    @Test
    public void CanDoStuff()
    {
        assertTrue(true);
    }

}
