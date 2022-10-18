package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class СalculatorTest {

    public static void main(String[] args) {
        Сalculator calculatorOne = new Сalculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if("yes".equals(answer)) {
                System.out.println("Введите первое число:");
                calculatorOne.setNum1(scanner.nextInt());
                System.out.println("Введите знак математической операции:");
                calculatorOne.setSign(scanner.next().charAt(0));
                System.out.println("Введите второе число:");
                calculatorOne.setNum2(scanner.nextInt());
                calculatorOne.calculate();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}
