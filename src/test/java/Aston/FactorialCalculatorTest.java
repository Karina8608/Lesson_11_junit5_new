package Aston;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCalculateFactorialWithPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120;

        long actualFactorial = FactorialCalculator.calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial, "Факториал " + number + " должен быть равен " + expectedFactorial);
    }

    @Test
    void testCalculateFactorialWithZero() {
        int number = 0;
        long expectedFactorial = 1;

        long actualFactorial = FactorialCalculator.calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial, "Факториал " + number + " должен быть равен " + expectedFactorial);
    }

    @Test
    void testCalculateFactorialWithNegativeNumber() {
        int negativeNumber = 121;
        long expectedFactorialForNegative = 0;

        long actualFactorialForNegative = FactorialCalculator.calculateFactorial(negativeNumber);

        assertEquals(expectedFactorialForNegative, actualFactorialForNegative, "Факториал " + negativeNumber + " должен быть равен " + expectedFactorialForNegative);
    }
}
