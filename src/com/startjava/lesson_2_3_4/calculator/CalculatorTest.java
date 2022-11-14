package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                try {
                    System.out.println("Результат вычисления: " + Calculator.calculate(scanner.nextLine()));
                } catch (IllegalArgumentException e) {
                    System.err.println("Ошибка, введен не правильный символ: " + e.getMessage());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}
