import java.util.Scanner;


public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String answer = "yes";
        do {
            if("yes".equals(answer)) {
            guessNumber.gameplay();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}
