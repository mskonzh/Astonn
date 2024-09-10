import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTestJunit {

    @Test
    void testFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(2, FactorialCalculator.factorial(2));
        assertEquals(6, FactorialCalculator.factorial(3));
        assertEquals(24, FactorialCalculator.factorial(4));
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialWithNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Number should be non-negative.", exception.getMessage());
    }
}