public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1 Перевод псевдокода на язык Java\n");
        int age = 26;
        double growth = 1.82;
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

        if(growth < 1.80) {
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
        int variable1 = 1;
        int variable2 = 10;
        int max;
        int min;
        if(variable1 > variable2 && variable1 != variable2) {
            max = variable1; 
            System.out.println("max число = " + max);
        } else {
            max = variable2;
            System.out.println("max число = " + max);
        }

        if(variable2 < variable1 && variable1 != variable2) {
            min = variable2;
            System.out.println("min число = " + min + "\n");
        } else {
            min = variable1;
            System.out.println("min число = " + min + "\n");
        }

        if(variable1 == variable2) {
            System.out.println("Числа равны " + variable1 + " = " + variable2 + "\n");
        }

        System.out.println("Задача №3 Работа с числом\n");
        int num = 25;
        boolean isEvenNumber = num % 2 == 0;
        boolean isNumNegative = num < 0;
        System.out.println("Исходное число = " + num);
        if(num <= 0) {
            return;
        }

        if(isEvenNumber) {
            System.out.println("Число = " + num + " является четным");
        } else if(!isEvenNumber) {
            System.out.println("Число = " + num + " является нечетным");
        } 

        if(isNumNegative) {
            System.out.println("Число = " + num + " является отрицательным");
        } else if(!isNumNegative ) {
            System.out.println("Число = " + num + " является положительным\n");
        }

        System.out.println("Задача №4 Поиск одинаковых цифр в числах\n");
        int threeDigit1 = 124;
        int threeDigit2 = 126;
        System.out.println("Исходные числа " + threeDigit1 + " и " + threeDigit2 + "\n");
        int unitsThreeDigit = threeDigit1 % 10;
        int dozenThreeDigit  = (threeDigit1 / 10) % 10;
        int hundredsThreeDigit  = threeDigit1 / 100;
        int unitsThreeDigit2 = threeDigit2 % 10;
        int dozenThreeDigit2  = (threeDigit2 / 10) % 10;
        int hundredsThreeDigit2  = threeDigit2 / 100;
        boolean identicalUnits = (threeDigit1 == threeDigit2);
        boolean identicalDozen = (dozenThreeDigit == dozenThreeDigit2);
        boolean identicalHundreds = (hundredsThreeDigit == hundredsThreeDigit2);
            if(identicalUnits) {
                System.out.println("Одинаковые цифры в числах " + unitsThreeDigit + " и " + unitsThreeDigit2);
            }

            if(identicalDozen) {
                System.out.println("Одинаковые цифры в числах " + dozenThreeDigit + " и " + dozenThreeDigit2);
            }

            if(identicalHundreds) {
                System.out.println("Одинаковые цифры в числах " + hundredsThreeDigit + " и " + hundredsThreeDigit2 + "\n");
            } 

            if(!identicalUnits) {
                if(!identicalDozen) {
                    if(!identicalHundreds) {
                System.out.println("Нет одинаковых цифр в числах "+ "\n");
            }
        }
    }

            if(identicalUnits) {
                System.out.println("У одинаковых цифр номер разряда 1 ");
            } 

            if(identicalDozen) {
                System.out.println("У одинаковых цифр номер разряда 2 ");
            }

            if(identicalHundreds) {
                System.out.println("У одинаковых цифр номер разряда 3 \n");
            }

        System.out.println("Задача №5 Определение буквы, числа или символа по их коду\n");
        char symbolUnicode = '\u0057';
        System.out.println("Маленькая буква " + (char) (symbolUnicode ^ 0x20));
        System.out.println("Большая буква " + symbolUnicode);
        System.out.println("Число " + (int) symbolUnicode);
        System.out.println("Не буква и не число " + (symbolUnicode = 0) + "\n");

        System.out.println("Задача №6 Определение суммы вклада и начисленных банком %\n");
        int depositAmount = 300000;
        int daysPlacement = 365;
        int numberOfDays = 365;
        System.out.println("Сумма вклада = " + depositAmount);
        int accruals;
        int accruedPercent;
        if(depositAmount < 100000) {
           accruals = depositAmount / 100 * 5;
           accruedPercent = accruals * 100 / depositAmount;
           System.out.println("Начисленный % за " + daysPlacement + " дней = " + accruedPercent + "%");
           System.out.println("Итоговая сумма с " + accruedPercent + "% = " + accruals + "\n");
        } else if(depositAmount >= 100000 && depositAmount <= 300000) {
           accruals = depositAmount / 100 * 7;
           accruedPercent = accruals * 100 / depositAmount;
           System.out.println("Начисленный % за " + daysPlacement + " дней = " + accruedPercent + "%");
           System.out.println("Итоговая сумма с " + accruedPercent + "% = " + accruals + "\n");
        } else if(depositAmount > 300000) {
           accruals = depositAmount / 100 * 10;
           accruedPercent = accruals * 100 / depositAmount;
           System.out.println("Начисленный % за " + daysPlacement + " дней = " + accruedPercent + "%");
           System.out.println("Итоговая сумма с " + accruedPercent + "% = " + accruals + "\n");
        }

        System.out.println("Задача №7 Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int assessment;
        double averageScore;
        double averagePercent;
        if(historyPercent <= 60 ) {
            System.out.println("Оценка 2 по предмету История");
        } else if (historyPercent > 60 && historyPercent <= 72) {
            System.out.println("Оценка 3 по предмету История");
        } else if(historyPercent >= 73 && historyPercent <= 90) {
            System.out.println("Оценка 4 по предмету История");
        } else if(historyPercent >= 91) {
            System.out.println("Оценка 5 по предмету История");
        }

        if(programmingPercent <= 60 ) {
            System.out.println("Оценка 2 по предмету Программирование");
        } else if (programmingPercent > 60 && programmingPercent <= 72) {
            System.out.println("Оценка 3 по предмету Программирование");
        } else if(programmingPercent >= 73 && programmingPercent <= 90) {
            System.out.println("Оценка 4 по предмету Программирование");
        } else if(programmingPercent >= 91) {
            System.out.println("Оценка 5 по предмету Программирование \n"); 
        }

        System.out.println("Задача №8 Расчет прибыли\n");
        int rentRoom = 5000;
        int averageMonthlySales = 13000;
        int costPrice = 9000;
        int annualRevenue;
        annualRevenue = (averageMonthlySales * 12) - (rentRoom * 12 + costPrice * 12);
        if(annualRevenue > 0) {
            System.out.println("Прибыль за год: + " + annualRevenue + "\n");
        }

        if(annualRevenue < 0) {
            System.out.println("Прибыль за год: " + annualRevenue + "\n");
        }

        System.out.println("Задача №9 Подсчет количества банкнот\n");
        int mustBeRemoved = 567;
        int banknoteValueOne = 0;
        int banknoteValueTen = 5;
        int banknoteValueHundred = 0;
        int missingAmount;
        int initialAmount;
        System.out.println("Номиналы банкнот: " + "номинал 100 - " + banknoteValueHundred + "; " + 
                " номинал 10 - "  + banknoteValueTen + "; " + " номинал 1 - " + banknoteValueOne);
        missingAmount = mustBeRemoved - banknoteValueTen * 10;
        banknoteValueHundred = missingAmount % 8;
        banknoteValueOne = missingAmount - 500;
        System.out.println("Требуемое количество банкнот: " + "номинал 100 - " + banknoteValueHundred
             + "; " + " номинал 10 - "  + banknoteValueTen + "; " + " номинал 1 - " + banknoteValueOne);
        initialAmount = banknoteValueHundred * 100 + banknoteValueTen * 10 + banknoteValueOne;
        System.out.println("Посчитанная исходная сумма: " + initialAmount);












    }
}
