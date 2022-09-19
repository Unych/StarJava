public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1 Перевод псевдокода на язык Java\n");
        int age = 26;
        double height = 1.82;
        boolean male = true;
        if(age > 20) {
            System.out.println("Мне больше 20 лет");
        } else {
            System.out.println("Мне меньше 20 лет");
        }

        if(!male) {
            System.out.println("У меня не мужской пол");
        } else
            System.out.println("У меня мужской пол");

        if(height < 1.80) {
            System.out.println("У меня рост меньше 180 см");
        } else {
           System.out.println("У меня рост больше 180 см"); 
        }

        char firstLetterName = "Dima".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имена М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имена I");
        } else {
            System.out.println("Первая буква имена D\n");
        }

        System.out.println("Задача №2 Поиск max и min числа\n");
        int number1 = 1;
        int number2 = 10;
        if(number1 > number2) {
            System.out.println("max число = " + number1 + "\n" + "min число = " + number2 + "\n");
        } else if(number1 < number2) {
            System.out.println("max число = " + number2 + "\n" + "min число = " + number1 + "\n");
        } else {
            System.out.println("Числа равны " + number1 + " = " + number2 + "\n");
        }

        System.out.println("Задача №3 Работа с числом\n");
        int num = 25;
        System.out.println("Исходное число = " + num + "\n");
        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println("Число = " + num + " является четным");
        } else {
                 System.out.println("Число = " + num + " является нечетным");
        }

        if(num < 0) {
            System.out.println("Число = " + num + " является отрицательным");
        } else {
            System.out.println("Число = " + num + " является положительным\n");
        }
        }

        System.out.println("Задача №4 Поиск одинаковых цифр в числах\n");
        int num1 = 124;
        int num2 = 126;
        System.out.println("Исходные числа " + num1 + " и " + num2 + "\n");
        int onesNum1 = num1 % 10;
        int dozensNum1 = (num1 / 10) % 10;
        int hundredsNum1  = num1 / 100;
        int onesNum2 = num2 % 10;
        int dozensNum2  = (num2 / 10) % 10;
        int hundredsNum2  = num2 / 100;
        if(onesNum1 == onesNum2) {
            System.out.println("Одинаковые цифры в числах " + onesNum1 + " и " + onesNum2 + "; " + 
                "Номер разряда 1" + "\n");
        }

        if(dozensNum1 == dozensNum2) {
            System.out.println("Одинаковые цифры в числах " + dozensNum1 + " и " + dozensNum2 + "; "
                + "Номер разряда 2" + "\n");
        }

        if(hundredsNum1 == hundredsNum2) {
            System.out.println("Одинаковые цифры в числах " + hundredsNum1 + " и " + hundredsNum2 +
                "; " +"Номер разряда 3" + "\n");
        } 

        if(onesNum1 != onesNum2 && dozensNum1 != dozensNum2 && hundredsNum1 != hundredsNum2) {
            System.out.println("Нет одинаковых цифр в числах "+ "\n");
        }

        System.out.println("Задача №5 Определение буквы, числа или символа по их коду\n");
        char uncknownChar = '\u0057';
        if(uncknownChar < 'w') {
            uncknownChar += 32;
            System.out.println("Маленькая буква " + uncknownChar);
        }

        if(uncknownChar > 'W') {
            uncknownChar -= 32;
        System.out.println("Большая буква " + uncknownChar);
    }

        if(uncknownChar == 'W') {
        System.out.println("Число " + (int) uncknownChar);
    }

        if(uncknownChar == 'W') {
            uncknownChar = 0;
        System.out.println("Не буква и не число " + uncknownChar + "\n");
    }

        System.out.println("Задача №6 Определение суммы вклада и начисленных банком %\n");
        int depositAmount = 300000;
        int daysPlacement = 365;
        System.out.println("Сумма вклада = " + depositAmount);
        int percent = 0;
        if(depositAmount < 100000) {
            percent = 5;
        } else if(depositAmount >= 100000 && depositAmount <= 300000) {
            percent = 7;
        } else if(depositAmount > 300000) {
            percent = 10;
        }
        int accruals = depositAmount / 100 * percent;
        int accruedPercent = accruals * 100 / depositAmount;
        System.out.println("Начисленный % за " + daysPlacement + " дней = " + accruedPercent + "%");
        System.out.println("Итоговая сумма с " + accruedPercent + "% = " + accruals + "\n");

        System.out.println("Задача №7 Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        double markHistory = 0;
        double markProgramming = 0;
        if(historyPercent <= 60) {
            markHistory = 2;
            System.out.println("Оценка 2 по предмету История");
        } else if (historyPercent > 60 && historyPercent <= 72) {
            markHistory = 3;
            System.out.println("Оценка 3 по предмету История");
        } else if(historyPercent >= 73 && historyPercent <= 90) {
            markHistory = 4;
            System.out.println("Оценка 4 по предмету История");
        } else if(historyPercent >= 91) {
            markHistory = 5;
            System.out.println("Оценка 5 по предмету История");
        }

        if(programmingPercent <= 60) {
            markProgramming = 2;
            System.out.println("Оценка 2 по предмету Программирование");
        } else if (programmingPercent > 60 && programmingPercent <= 72) {
            markProgramming = 3;
            System.out.println("Оценка 3 по предмету Программирование");
        } else if(programmingPercent >= 73 && programmingPercent <= 90) {
             markProgramming = 4;
            System.out.println("Оценка 4 по предмету Программирование");
        } else if(programmingPercent >= 91) {
            markProgramming = 5;
            System.out.println("Оценка 5 по предмету Программирование"); 
        }

        double averageMark = (markHistory + markProgramming) / 2;
        System.out.println("Cредний балл оценок по предметам " + averageMark);

        double averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("Средний % по предметам = " + averagePercent + "\n");

        System.out.println("Задача №8 Расчет прибыли\n");
        int rentRoom = 5000;
        int averageMonthlySales = 13000;
        int costPrice = 9000;
        int annualRevenue = 12 * (averageMonthlySales - rentRoom  - costPrice);
        if(annualRevenue > 0) {
            System.out.println("Прибыль за год: + " + annualRevenue + "\n");
        } else {
            System.out.println("Прибыль за год: " + annualRevenue + "\n");
        }

        System.out.println("Задача №9 Подсчет количества банкнот\n");
        int mustBeRemoved = 567;
        int banknoteValue1 = 0;
        int banknoteValue10 = 5;
        int banknoteValue100 = 0;
        int onesBanknote = mustBeRemoved % 10;
        int dozensBanknote = (mustBeRemoved / 10) % 10;
        int hundredsBanknote  = mustBeRemoved / 100;
        System.out.println("Номиналы банкнот: 1, 10 , 100");
        if(onesBanknote != banknoteValue1 || dozensBanknote != banknoteValue10 || hundredsBanknote
                != banknoteValue100) {
        int missingAmount = mustBeRemoved - banknoteValue10 * 10;
        banknoteValue100 = missingAmount % 8;
        banknoteValue1 = missingAmount - 500;
    }
        System.out.println("Требуемое количество банкнот: " + "номинал 100 - " + banknoteValue100
                + "; " + " номинал 10 - "  + banknoteValue10 + "; " + " номинал 1 - " + banknoteValue1);
        int initialAmount = banknoteValue100 * 100 + banknoteValue10 * 10 + banknoteValue1;
        System.out.println("Посчитанная исходная сумма: " + initialAmount);












    }
}
