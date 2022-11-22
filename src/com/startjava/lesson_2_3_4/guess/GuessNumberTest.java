package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("У каждого игрока по 10 попыток\n");
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(scanner));

        String option = "yes";

        while (!option.equals("no")) {
            if (option.equals("yes")) {
                game.startGame();
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            option = scanner.nextLine();
        }
    }

        private static Player[] createPlayers(Scanner scanner){
            Player[] players = new Player[3];
            for (int i = 0; i < players.length; i++) {
                System.out.print("Введите имя игрока " + (i + 1) + ": ");
                players[i] = new Player(scanner.nextLine());
            }
            return players;
        }
    }
