package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1 Реверс значений массива");
        int[] intArr = {1, 4, 5, 2, 7, 3};
        int length = intArr.length;
        System.out.println(Arrays.toString(intArr));
        for(int i = 0; i < length; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = temp;
        }
        System.out.println(Arrays.toString(intArr));

        System.out.println("\nЗадача №2 Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for(int i = 0; i < 10; i++) {
            intArr[i] = i;
        }
        int multDigits = 1;
        for(int i = 1; i < length - 1; i++) {
            intArr[i] = i;
            multDigits *= intArr[i];
            System.out.print(i < 8 ? i + " * " : i + " = " + multDigits);
        }
        System.out.println("\nИндекс " + intArr[0] + " = " + intArr[0] +
                    " индекс " + intArr[9] + " = " + intArr[9]);

        System.out.println("\nЗадача №3 Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for(int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArr(doubleArr);
        int zeroedCellCount = 0;
        double middleNum  = doubleArr[length / 2];
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleNum ) {
                doubleArr[i] = 0;
                zeroedCellCount++;
            }
        }
        System.out.println("Измененный массив");
        printDoubleArr(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroedCellCount);

        System.out.println("\nЗадача №4 Вывод элементов массива лесенкой в обратном порядке");
        char[] engAlphabet  = new char['Z' - 'A' + 1];
        length = engAlphabet.length;
        for (int i = 0; i < length; i++) {
            engAlphabet [i] = (char) ('A' + i);
        }

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= length - 1 - i; j--) {
                System.out.print(engAlphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\nЗадача №5 Генерация уникальных чисел");
        intArr = new int[30];
        int num = 60;
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (intArr[j] == num) {
                    num = (int) (Math.random() * 40) + 60;
                    j = - 1;
                }
            }
            intArr[i] = num;
        }

        Arrays.sort(intArr);
        for (int i = 0, j = 1; i < length; i++, j++) {
            System.out.printf("%3d", intArr[i]);
            if (j == 10) {
                j = 0;
                System.out.println();
            }
        }
    }

    private static void printDoubleArr(double[] arr) {
        int numPosition = 0;
        for (double num : arr) {
            System.out.printf("%6.3f", num);
            if (numPosition % 7 == 0 && numPosition != 0) {
                System.out.println();
            }
            numPosition++;
        }
    }
}
