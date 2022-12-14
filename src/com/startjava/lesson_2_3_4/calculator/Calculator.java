package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int numOne;
    private static int numTwo;
    private static String sign;

    public static int calculate(String expression) {
        parseExpression(expression);
        return switch (sign) {
            case "+" -> Math.addExact(numOne, numTwo);
            case "-" -> Math.subtractExact(numOne, numTwo);
            case "*" -> Math.multiplyExact(numOne, numTwo);
            case "/" -> numOne / numTwo;
            case "%" -> numOne % numTwo;
            case "^" -> (int) Math.pow(numOne, numTwo);
            default -> throw new IllegalArgumentException("Введен не правильный символ " + sign);
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length != 3) {
            throw new IllegalArgumentException("Выражение должно состоять из трех частей, разделенных пробелами!");
        }

        try {
            numOne = Integer.parseInt(partsExpression[0]);
            numTwo = Integer.parseInt(partsExpression[2]);
            sign = partsExpression[1];
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("В выражении допустимо использовать" +
                    " только целые положительные числа!");
        }
        if (numOne < 1 || numTwo < 1) {
            throw new IllegalArgumentException("В выражении допустимо использовать" +
                    " только целые положительные числа!");
        }
    }
}