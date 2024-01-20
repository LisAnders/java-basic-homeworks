package ru.kravchenko.java.basic.homeworks.homework2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printInstruction();
        while (true) {
            System.out.print("Выберите номер задания: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                System.out.print("Введите строку, которую надо напечатать: ");
                String string = scanner.nextLine();
                System.out.print("Введите кол-во, сколько раз напечатать: ");
                int repeat = scanner.nextInt();
                System.out.println("Результат выполнения:");
                printStringRepeatedly(repeat, string);
            } else if (userInput.equals("2")) {
                int[] arr = {1, 2, 5, 6, 8, 3};
                System.out.println("Результат выполнения по массиву " + Arrays.toString(arr) + ":");
                sumArrayElements(arr);
            } else if (userInput.equals("3")) {
                System.out.print("Введите длину желаемого массива: ");
                int arrLength = scanner.nextInt();
                System.out.print("Введите число, которым его заполнить: ");
                int arrNumber = scanner.nextInt();
                int[] arr = new int[arrLength];
                System.out.println("Результат выполнения:");
                fillArrayByNumbers(arrNumber, arr);
            } else if (userInput.equals("4")) {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                System.out.println("Имеется массив " + Arrays.toString(arr));
                System.out.print("Введите число, на которое увеличить все элементы массыва: ");
                int number = scanner.nextInt();
                System.out.println("Результат выполнения:");
                increaseArrayElementByNumber(number, arr);
            } else if (userInput.equals("5")) {
                int[] arr = {1, 2, 5, 6, 8, 3};
                System.out.println("Результат выполнения по массиву " + Arrays.toString(arr) + ":");
                compareArrayHalves(arr);

            } else if (userInput.equals("*")) {
                System.out.println("-------- Задания со * --------");
                printInstructionWithStar();
                while (true) {
                    System.out.print("Выберите номер задания: ");
                    userInput = scanner.nextLine();
                    if (userInput.equals("1")) {
                        int[] arr1 = {1, 2, 3, 4};
                        int[] arr2 = {3, 4};
                        int[] arr3 = {1, 1, 6, 9, 2, 4};
                        System.out.println("Результат выполнения по массивам: \n   " + Arrays.toString(arr1) + "\n + " +
                                Arrays.toString(arr2) + "\n + " + Arrays.toString(arr3) + "\n Равен:");
                        sumSetOfArrays(arr1, arr2, arr3);
                    } else if (userInput.equals("2")) {
                        int[] arr = {1, 2, 3, 3, 3};
                        System.out.println("Точка массива: " + Arrays.toString(arr) + " :");
                        pointOfArray(arr);
                    } else if (userInput.equals("3")) {
                        int[] arr = {1, 2, 3, 4, 5, 6, 7};
                        System.out.println("Выберете порядок проверки массива " + Arrays.toString(arr) + " : \n  '<' - Возрастание \n '>' - Убывание");
                        String order = scanner.nextLine();
                        chekElementOrder(order, arr);
                    } else if (userInput.equals("4")) {
                        int[] arr = {1, 2, 3, 4, 5, 6};
                        System.out.println("Результат переворачивания массива " + Arrays.toString(arr) + " :");
                        reversArray(arr);
                    } else if (userInput.equals("0")) {
                        System.out.println("---- Возврат к обычным заданиям -----");
                        printInstruction();
                        break;
                    }
                }
            } else if (userInput.equals("0")) {
                System.out.println("---- Выход из программы ----");
                break;
            }
        }
    }

    // Домашнее задание
    // 1) Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
    //    консоль строку указанное количество раз
    public static void printStringRepeatedly(int repeat, String string) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(string);
        }
    }

    // 2) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
    //    элементы, значение которых больше 5, и печатающий полученную сумму в консоль
    public static void sumArrayElements(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                result += arr[i];
            }
        }
        System.out.println(result);
    }

    // 3) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    //    массив, метод должен заполнить каждую ячейку массива указанным числом;
    public static void fillArrayByNumbers(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    //    массив, увеличивающий каждый элемент массива на указанное число;
    public static void increaseArrayElementByNumber(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 5) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
    //    консоль информацию о том, сумма элементов какой из половин массива больше;
    public static void compareArrayHalves(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            leftSum += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            rightSum += arr[i];
        }
        if (leftSum == rightSum) {
            System.out.println("Стороны массива равны");
        } else if (leftSum > rightSum) {
            System.out.println("Левая сторона массива больше");
        } else {
            System.out.println("Правая сторона массива больше");
        }
    }

    // -------------------------------------------------------------------------------------------
    // Задания со *
    //
    // 1) Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    //    массив равный сумме входящих;
    //    Пример:
    //      { 1, 2, 3 }
    //    + { 2, 2 }
    //    + { 1, 1, 1, 1, 1}
    //    = { 4, 5, 4, 1, 1 }
    public static void sumSetOfArrays(int[] arr1, int[] arr2, int[] arr3) {
        int[] resArr = new int[Math.max(Math.max(arr1.length, arr2.length), arr3.length)];
        for (int i = 0; i < arr1.length; i++) {
            resArr[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resArr[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            resArr[i] += arr3[i];
        }
        System.out.println(Arrays.toString(resArr));
    }

    // 2) Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
    //    равны. “Точка находится между элементами”;
    //    Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    public static void pointOfArray(int[] arr) {
        int leftSide = 0;
        int rightSide;
        for (int i = 0; i < arr.length; i++) {
            rightSide = 0;
            leftSide += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightSide += arr[j];
            }
            if (leftSide == rightSide) {
                System.out.print("{ ");
                for (int k = 0; k < arr.length; k++) {
                    if (i == k) {
                        System.out.print(arr[k] + ", | ");
                    } else if (k == arr.length - 1) {
                        System.out.print(arr[k]);
                    } else {
                        System.out.print(arr[k] + ", ");
                    }
                }
                System.out.println("}");
                break;
            }
        }
    }

    // 3) Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
    //    возрастания (по выбору пользователя)
    public static void chekElementOrder(String order, int[] arr) {
        int chek = 0;
        if (order.equals("<")) {
            // Возрастание
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        chek++;
                        break;
                    }
                }
            }
            if (chek == 0) {
                System.out.println("Элементы идут в порядке возрастания: " + Arrays.toString(arr));
            } else {
                System.out.println("Элементы не идут в порядке возрастания: " + Arrays.toString(arr));
            }
        } else if (order.equals(">")) {
            //Убывание
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        chek++;
                        break;
                    }
                }
            }
            if (chek == 0) {
                System.out.println("Элементы идут в порядке убывания: " + Arrays.toString(arr));
            } else {
                System.out.println("Элементы не идут в порядке убывания: " + Arrays.toString(arr));
            }
        } else {
            System.out.println("'<' - Возрастание, '>' - Убывание");
        }
    }

    // 4) Реализуйте метод, “переворачивающий” входящий массив
    //    Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void reversArray(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            resultArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resultArr));
    }



    // Инструкции для консоли
    public static void printInstruction() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("| 1 | Метод, принимающий в качестве аргументов целое число и строку, и печатающий в |\n" +
                "| - | консоль строку указанное количество раз.                                      |");
        System.out.println("| 2 | Метод, принимающий в качестве аргумента целочисленный массив, суммирующий все |\n" +
                "| - | элементы, значение которых больше 5, и печатающий полученную сумму в консоль. |");
        System.out.println("| 3 | Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный|\n" +
                "| - | массив, метод должен заполнить каждую ячейку массива указанным числом         |");
        System.out.println("| 4 | Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный|\n" +
                "| - | массив, увеличивающий каждый элемент массива на указанное число               |");
        System.out.println("| 5 | Метод, принимающий в качестве аргумента целочисленный массив, и печатающий в  |\n" +
                "| - | консоль информацию о том, сумма элементов какой из половин массива больше     |");
        System.out.println("| * |                                 Задания со *                                  |");
        System.out.println("| 0 |                              Выход из программы                               |");
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void printInstructionWithStar() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("| 1 | Метод, принимающий на вход набор целочисленных массивов, и получающий новый   |\n" +
                "| - | массив равный сумме входящих                                                  |");
        System.out.println("| 2 | Метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой |\n" +
                "| - | части равны. “Точка находится между элементами                                |");
        System.out.println("| 3 | Метод, проверяющий что все элементы массива идут в порядке убывания или       |\n" +
                "| - | возрастания (по выбору пользователя)                                          |");
        System.out.println("| 4 | Метод, “переворачивающий” входящий массив                                     |");
        System.out.println("| 0 |                          Выход к основной части                               |");
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
