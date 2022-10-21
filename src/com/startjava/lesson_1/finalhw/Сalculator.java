package com.startjava.lesson_1.finalhw;

public class Сalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        char sign = '^';
        int result = 0;
        if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if(sign == '*') {
            result = num1 * num2;
        } else if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '%') {
            result = num1 % num2;
        } else if(sign == '^') {
            result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
        }
        System.out.print(num1 + " " + sign + " " + num2 + " = " + result);
    }
}