package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int numOne = Integer.parseInt(partsExpression[0]);
        int numTwo = Integer.parseInt(partsExpression[2]);
        String sign = partsExpression[1];
        int result = 1;
        switch(sign) {
            case "+" :
                result = Math.addExact(numOne, numTwo);
                break;
            case "-" :
                result = Math.subtractExact(numOne, numTwo);
                break;
            case "*" :
                result = Math.multiplyExact(numOne, numTwo);
                break;
            case "/" :
                result = numOne / numTwo;
                break;
            case "%" :
                result = numOne % numTwo;
                break;
            case "^" :
                result = (int) Math.pow(numOne, numTwo);
                break;
            default :
                System.out.println("Вы вели неправильный символ");
        }
        return result;
    }
}