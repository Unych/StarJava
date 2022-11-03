package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
        private String expression;

        public void setExpression(String expression) {
            this.expression = expression;
        }


    public void calculate() {
        String[] arrnum = expression.split(" ");
        int indexZero = Integer.parseInt(String.valueOf(Integer.parseInt(arrnum[0])));
        int indexTwo = Integer.parseInt(String.valueOf(Integer.parseInt(arrnum[2])));
        String sign = arrnum[1];
        int result = 1;
        switch(sign) {
            case "+" :
                result = Math.addExact(indexZero, indexTwo);
                break;
            case "-" :
                result = Math.subtractExact(indexZero, indexTwo);
                break;
            case "*" :
                result = Math.multiplyExact(indexZero, indexTwo);
                break;
            case "/" :
                result = indexZero / indexTwo;
                break;
            case "%" :
                result = indexZero % indexTwo;
                break;
            case "^" :
                result = (int) Math.pow(indexZero, indexTwo);
                break;
            default :
                System.out.println("Вы вели неправильный символ");
        }
        System.out.println(indexZero + " " + sign + " " + indexTwo + " = " + result);
    }
}