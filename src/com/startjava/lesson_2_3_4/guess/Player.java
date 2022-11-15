package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];

    private int move;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[move - 1];
    }

    public void addNumber(int number) {
        numbers[move++] = number;
    }

    public int getMove() {
        return move;
    }

    public boolean hasMoves() {
        return move < 10;
    }

    public void reset() {
        Arrays.fill(numbers, 0, move, 0);
        move = 0;
    }

    public int[] getAnswers() {
        return Arrays.copyOf(numbers, move);
    }
}