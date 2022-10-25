package com.startjava.lesson_1.finalhw;

public class MyFirstGame {
    public static void main(String[] args) {

        int hiddenNum = 37;
        int playerNum = 89;
        int startRange = 1;
        int endRange = 100;
        while (playerNum != hiddenNum) {
            playerNum = (startRange + endRange) / 2;
            if (playerNum < hiddenNum) {
                startRange = playerNum + 1;
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            } else if (playerNum > hiddenNum) {
                endRange = playerNum - 1;
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            }
        }
        System.out.println("Вы победили! число " + playerNum + " = " + hiddenNum);
    }
}