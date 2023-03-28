package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MyCalculatorForGUnitTest {
    @ParameterizedTest
    @CsvSource(value = {"2,5,7", "19999.05, 19, 20018.05", "0,345,345", "14,-2,12"})
    public void testAdd(double firstValue, double lastValue, double result) {
        Assertions.assertEquals(result, MyCalculatorForGUnit.add(firstValue, lastValue));
    }

    @ParameterizedTest
    @CsvSource(value = {"2,5,-3", "157.789, 12.618, 145.171", "0,345,-345", "12245,1975.2, 10269.8"})
    public void testSubtract(double firstValue, double lastValue, double result) {
        Assertions.assertEquals(result, MyCalculatorForGUnit.subtract(firstValue, lastValue));
    }

    @ParameterizedTest
    @CsvSource(value = {"3,6,18", "441,988.3, 435840.3", "0,345,0", "600,0,0", "12245,1975.2, 24186324"})
    public void testMultiply(double firstValue, double lastValue, double result) {
        Assertions.assertEquals(result, MyCalculatorForGUnit.multiply(firstValue, lastValue));
    }

    @ParameterizedTest
    @CsvSource(value = {"81,9,9", "381.468, 127.156, 3", "0,345,0"})
    public void testDivide(double firstValue, double lastValue, double result) {
        Assertions.assertEquals(result, MyCalculatorForGUnit.divide(firstValue, lastValue));
    }

    @Test
    void testDivideOnZero() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    MyCalculatorForGUnit.divide(12, 0);
                }
        );
        Assertions.assertEquals("Ошибка деления на ноль", exception.getMessage());
    }
}
