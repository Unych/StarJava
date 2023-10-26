package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1 Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
                if(counter % 2 == 0) {
                   sumEven += counter;
                } else {
                   sumOdd += counter;
                }
                counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = "+ sumEven + 
                    " а нечетных = "+ sumOdd);

        System.out.println("\nЗадача №2 Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 > num3) {
            int tmp = num3;
            num3 = num1;
            num1 = tmp;
        }

        if (num2 > num3) {
            num3 = num2;
        }

        if (num2 < num1) {
            num1 = num2;
        }

        for(int i = num3 - 1; i > num1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача №3 Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sumDigits = 0;
        while(num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\nЗадача №4 Вывод чисел на консоль в несколько строк\n");
        int count  = 1;
        for(int i = 1; i <= 24; i += 2) {
            if(count == 6) {
                System.out.println();
                count = 1;
            }
            System.out.printf("%3d", i);
            count++;
        }

        while(count % 6 > 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\nЗадача №5 Проверка количества единиц на четность\n");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (copyNum > 0) {
            if (copyNum % 10 == 1) {
                countOnes++;
            }
            copyNum /= 10;
        }

        if (countOnes != 0) {
            if (countOnes % 2 == 0) {
                System.out.println("Число " + num + " содержит " + countOnes +
                         " (четное) количество единиц");
            } else {
                System.out.println("Число " + num + " содержит " + countOnes +
                         " (нечетное) количество единиц");
            }
        }

        System.out.println("\nЗадача №6 Отображение фигур в консоли\n");
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int lines = 5;
        int symbolsInLine = lines;
        while (symbolsInLine > 0) {
            System.out.print("#");
            symbolsInLine--;
            if (symbolsInLine == 0 && lines > 0) {
                symbolsInLine = --lines;
                System.out.println();
            }
        }
        System.out.println();

        int currentLine = 1;
        symbolsInLine = 1;
        count = 0;
        do {
            System.out.print("$");
            count++;
            if (count == symbolsInLine) {
                if (currentLine < 3) {
                    symbolsInLine++;
                } else {
                    symbolsInLine--;
                }
                count = 0;
                currentLine++;
                System.out.println();
            }
        } while (currentLine <= 5);

        System.out.println("\nЗадача №7 Отображение ASCII-символов\n");
        System.out.printf("%3s%5s%n", "DEC", "CHAR");
        for(int i = 0; i <= 47; i++) {
            if(i > 0 && i % 2 != 0) {
                System.out.printf("%3d%5c%n", i, i);
            }
        }

        for(int i = 97; i <= 122; i++) {
            if(i % 2 == 0) {
                System.out.printf("%3d%5c%n", i, i);
            }
        }

        System.out.println("\nЗадача №8 Проверка, является ли число палиндромом\n");
        int numDefault = 1234321;
        int numCount = numDefault;
        int numReverse = 0;
        while(numCount > 0) {
            int digit = numCount % 10;
            numReverse = numReverse * 10 + digit;
            numCount /= 10;
        }

        if(numDefault == numReverse) {
            System.out.println("Число " + numDefault + " является палиндромом");
        } else {
            System.out.println("Число " + numDefault + " не является палиндромом");
        }

        System.out.println("\nЗадача №9 Определение, является ли число счастливым\n");
        int numOfSix = 123456;
        int countFirstThreeNum = numOfSix / 1000;
        int countSecondThreeNum = numOfSix % 1000;
        int sumFirstThreeNum = 0;
        int sumSecondThreeNum = 0;
        int firstThreeNum = countFirstThreeNum;
        int secondThreeNum = countSecondThreeNum;
        while(countFirstThreeNum > 0) {
            sumFirstThreeNum += countFirstThreeNum % 10;
            countFirstThreeNum /= 10;

            sumSecondThreeNum += countSecondThreeNum % 10;
            countSecondThreeNum /= 10;
        }
        System.out.println("Сумма цифр " + firstThreeNum + " = " + sumFirstThreeNum);
        System.out.println("\nСумма цифр " + secondThreeNum + " = " + sumSecondThreeNum);

        if(sumFirstThreeNum == sumSecondThreeNum) {
            System.out.println("\nявляется число счастливым");
        } else {
            System.out.println("\nне является число счастливым");
        }

        System.out.println("\nЗадача №10 Вывод таблицы умножения Пифагора\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%3s", "|");
                } else if (i == 0) {
                    System.out.printf("%3d", j+1);
                } else if (i == 1) {
                    System.out.print("---");
                } else if (j == 0) {
                    System.out.printf("%2d|", i); 
                } else {
                    System.out.printf("%3d", (j + 1) * i);
                }
            }
            System.out.println();
            }
    }
}