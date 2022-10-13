import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startRound() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hiddenNum = random.nextInt((100) + 1);
        while(playerOne.getNumber() != hiddenNum) {
            System.out.println("Игрок " + playerOne.getName() + " Введите число");
            playerOne.setNumber(scanner.nextInt());
            if (playerOne.getNumber() < hiddenNum) {
                System.out.println("Число " + playerOne.getNumber() + 
                        " меньше того, что загадал компьютер");
            } else if (playerOne.getNumber() > hiddenNum) {
                System.out.println("Число " + playerOne.getNumber() + 
                        " больше того, что загадал компьютер");
            } else {
                System.out.println(playerOne.getName() + " Вы победили! число " + 
                        playerOne.getNumber() + " = " + hiddenNum);
                break;
            }
            System.out.println("Игрок " + playerTwo.getName() + " Введите число");

            playerTwo.setNumber(scanner.nextInt());
            if (playerTwo.getNumber() < hiddenNum) {
                System.out.println("Число " + playerTwo.getNumber() + 
                        " меньше того, что загадал компьютер");
            } else if (playerTwo.getNumber() > hiddenNum) {
                System.out.println("Число " + playerTwo.getNumber() + 
                        " больше того, что загадал компьютер");
            } else {
                System.out.println(playerTwo.getName() + " Вы победили! число "
                     + playerTwo.getNumber() + " = " + hiddenNum);
                break;
            }
        }
    }
}

