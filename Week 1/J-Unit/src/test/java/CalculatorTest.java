import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up test...");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Tearing down test...");
    }

    @Test
    public void testAdd() {
       
        int a = 5;
        int b = 3;

     
        int result = calculator.add(a, b);


        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {

        int a = 5;
        int b = 3;


        int result = calculator.subtract(a, b);


        assertEquals(2, result);
    }
}
