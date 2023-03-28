package org.example;

public class MyCalculatorForGUnit {
    public static double add(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    public static double subtract(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public static double multiply(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    public static double divide(double number1, double number2) {
        double result = number1 / number2;
        if (number2 == 0) {
            throw new IllegalArgumentException("Ошибка деления на ноль");
        } else return result;
    }
}
