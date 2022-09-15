public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1 Перевод псевдокода на язык Java\n");
        int age = 26;
        double humanHeight = 1.82;
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

        if(humanHeight < 1.80) {
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
        if(number1 > number2 && number1 != number2) {
            System.out.println("max число = " + number1);
        } else {
            System.out.println("max число = " + number2);
        }

        if(number2 < number1 && number1 != number2) {
            System.out.println("min число = " + number2 + "\n");
        } else {
            System.out.println("min число = " + number1 + "\n");
        }

        if(number1 == number2) {
            System.out.println("Числа равны " + number1 + " = " + number2 + "\n");
        }

        System.out.println("Задача №3 Работа с числом\n");
        int num = 25;
        boolean isEvenNumber = num % 2 == 0;
        boolean isNumNegative = num < 0;
        System.out.println("Исходное число = " + num + "\n");
        if(num > 0) {
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
                System.out.println("Одинаковые цифры в числах " + onesNum1 + " и " + onesNum2);
            }

        if(dozensNum1 == dozensNum2) {
                System.out.println("Одинаковые цифры в числах " + dozensNum1 + " и " + dozensNum2);
            }

        if(hundredsNum1 == hundredsNum2) {
                System.out.println("Одинаковые цифры в числах " + hundredsNum1 + " и " + hundredsNum2 + "\n");
            } 

        if(onesNum1 != onesNum2) {
            if(dozensNum1 != dozensNum2) {
                if(hundredsNum1 != hundredsNum2) {
                System.out.println("Нет одинаковых цифр в числах "+ "\n");
            }
        }
    }

            if(onesNum1 == onesNum2) {
                System.out.println("У одинаковых цифр номер разряда 1 ");
            } 

            if(hundredsNum1 == hundredsNum2) {
                System.out.println("У одинаковых цифр номер разряда 2 ");
            }

            if(hundredsNum1 == hundredsNum2) {
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
        double averagePercent = (historyPercent + programmingPercent) / 2;
        if(historyPercent <= 60) {
            System.out.println("Оценка 2 по предмету История");
        } else if (historyPercent > 60 && historyPercent <= 72) {
            System.out.println("Оценка 3 по предмету История");
        } else if(historyPercent >= 73 && historyPercent <= 90) {
            System.out.println("Оценка 4 по предмету История");
        } else if(historyPercent >= 91) {
            System.out.println("Оценка 5 по предмету История");
        }

        if(programmingPercent <= 60) {
            System.out.println("Оценка 2 по предмету Программирование");
        } else if (programmingPercent > 60 && programmingPercent <= 72) {
            System.out.println("Оценка 3 по предмету Программирование");
        } else if(programmingPercent >= 73 && programmingPercent <= 90) {
            System.out.println("Оценка 4 по предмету Программирование");
        } else if(programmingPercent >= 91) {
            System.out.println("Оценка 5 по предмету Программирование"); 
        }

        if(averagePercent <= 60) {
            System.out.println("Cредний балл оценок по предметам 2");
        } else if(averagePercent > 60 && averagePercent <= 72) {
            System.out.println("Cредний балл оценок по предметам 3");
        } else if(averagePercent >= 73 && averagePercent <= 90) {
            System.out.println("Cредний балл оценок по предметам 4");
        }  else if(averagePercent >= 91) {
            System.out.println("Cредний балл оценок по предметам 5");
        }
        System.out.println("Средний % по предметам = " + averagePercent + "\n");

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
        int banknoteValueOne;
        int banknoteValueTen = 5;
        int banknoteValueHundred;
        int missingAmount;
        int initialAmount;
        System.out.println("Номиналы банкнот: 1, 10 , 100");
        missingAmount = mustBeRemoved - banknoteValueTen * 10;
        banknoteValueHundred = missingAmount % 8;
        banknoteValueOne = missingAmount - 500;
        System.out.println("Требуемое количество банкнот: " + "номинал 100 - " + banknoteValueHundred
             + "; " + " номинал 10 - "  + banknoteValueTen + "; " + " номинал 1 - " + banknoteValueOne);
        initialAmount = banknoteValueHundred * 100 + banknoteValueTen * 10 + banknoteValueOne;
        System.out.println("Посчитанная исходная сумма: " + initialAmount);












    }
}
