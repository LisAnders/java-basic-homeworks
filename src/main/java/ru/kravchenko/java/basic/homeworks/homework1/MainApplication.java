package ru.kravchenko.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        boolean start = true;

        System.out.println("Для выбора нужного метода введите соответствующий номер");
        printInstruction();

        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер метода: ");
            int input = scanner.nextInt();
            System.out.println("\n-------------------------------------------------------");
            if (input == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (input == 1) {
                System.out.println("Результат метода greetings():");
                greetings();
                System.out.println("-------------------------------------------------------\n");
            } else if (input == 2) {
                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * -20);
                int c = (int) (Math.random() * 10);
                System.out.println("Результат метода checkSign(a:" + a + ", b:" + b + ", c:" + c + "):");
                checkSign(a, b, c);
                System.out.println("-------------------------------------------------------\n");
            } else if (input == 3) {
                System.out.println("Результат метода selectColor():");
                selectColor();
                System.out.println("-------------------------------------------------------\n");
            } else if (input == 4) {
                System.out.println("Результат метода compareNumbers():");
                compareNumbers();
                System.out.println("-------------------------------------------------------\n");
            } else if (input == 5) {
                int initValue = (int) (Math.random() * 20);
                int delta = (int) (Math.random() * 20);
                Random random = new Random();
                boolean increment = random.nextBoolean();
                System.out.println("Результат метода addOrSubtractAndPrint(initValue:" + initValue + ", delta:" + delta + ", increment:" + increment + ")");
                addOrSubtractAndPrint(initValue, delta, increment);
                System.out.println("-------------------------------------------------------\n");
            } else {
                System.out.println(" !! ВНИМАТЕЛЬНО ПРОЧТИ ИНСТРУКЦИЮ И ПОВТОРИ ДЕЙСТВИЕ !!");
                printInstruction();
            }
        }
    }

    // 1
    public static void greetings() {
        String[] array = {"Hello", "World", "from", "Java"};
        for (String a : array) {
            System.out.println(a);
        }
    }

    // 2
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 20);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
            System.out.println("Результат = " + result);
        } else {
            result = initValue - delta;
            System.out.println("Результат = " + result);
        }
    }

    // Метод для отрисовки инструкции
    public static void printInstruction() {
        System.out.println("-------------------------------------------------------");
        System.out.println("|| 1 ||    Метод  greetings()                        ||");
        System.out.println("|| 2 ||    Метод  checkSign()                        ||");
        System.out.println("|| 3 ||    Метод  selectColor()                      ||");
        System.out.println("|| 4 ||    Метод  compareNumbers()                   ||");
        System.out.println("|| 5 ||    Метод  addOrSubtractAndPrint()            ||");
        System.out.println("|| 0 ||                  Выход                       ||");
        System.out.println("-------------------------------------------------------\n");
    }
}
