package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[GuessNumber.ATTEMPTS];
    private int attempt;
    private int countWins;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new NumberFormatException("Введите число в интервале от 1 до 100!");
        }
        numbers[attempt++] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setCountsWin() {
        countWins = 0;
    }

    public int getAmountWins() {
        return countWins;
    }

    public void incAmountWin() {
        countWins++;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public boolean hasAttempt() {
        return attempt < GuessNumber.ATTEMPTS;
    }
}