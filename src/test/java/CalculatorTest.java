import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assertions.assertEquals(10, calculator.add(3,7));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(7, calculator.subtract(14,7));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(98, calculator.multiply(14,7));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.divide(14,7));
    }
}