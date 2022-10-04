public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenNum = 40;
        int userNum = 20;
        int i = 0;
        while (hiddenNum != userNum) {
            i++;
            if (i == 2) {
                userNum = 60;
            } else if (i == 3) {
                userNum = 30;
            } else if (i == 4) {
                userNum = 45;
            } else if (i == 5)
                userNum = 40;

        if (hiddenNum > userNum) {
            System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
        } else if (hiddenNum < userNum) {
            System.out.println("Число " + userNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Вы победили! число " + userNum + " = " + hiddenNum);
        }
        }
    }
}