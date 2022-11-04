package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                System.out.println("Результат вычисления: " + calculatorOne.calculate(scanner.nextLine()));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}
