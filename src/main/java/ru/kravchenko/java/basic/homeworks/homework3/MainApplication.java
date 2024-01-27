package ru.kravchenko.java.basic.homeworks.homework3;

public class MainApplication {

    public static void main(String[] args) {
        int[][] arr = {{-1, 2, -1}, {2, -1, 2}, {-1, 2, -1}};
        System.out.println("Сумма положительных элементов = " + sumOfPositiveElements(arr));

        System.out.println("Рисуем квадратик из звездочек:");
        printSquareOfStars(3);

        System.out.println("Нулим диагонали:");
        zeroingDiagonals(arr);

        int[][] arr2 = {{-7, -9, -8}, {-10, -1, -15}, {-9, -8, -7}};
        System.out.println("Максимальный элемент = " + findMax(arr2));

        int[][] arr3 = {{1, 1, 1}, {1, 2, 3}};
        System.out.println("Сумма элементов второй строки = " + sumSecondLineElements(arr3));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    result += array[i][j];
                }
            }
        }
        return result;
    }

    public static void printSquareOfStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeroingDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                if (array[i].length - 1 - j == i) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int maxEl = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxEl) {
                    maxEl = array[i][j];
                }
            }
        }
        return maxEl;
    }

    public static int sumSecondLineElements(int[][] array) {
        int result = 0;
        if (array.length < 2) {
            return 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 1) {
                    result += array[i][j];
                }
            }
        }
        return result;
    }

}
