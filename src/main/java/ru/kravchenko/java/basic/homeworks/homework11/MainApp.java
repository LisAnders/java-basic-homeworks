package ru.kravchenko.java.basic.homeworks.homework11;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        PersonDataBase dataBase = new PersonDataBase();
        Person personBob = new Person("Bob", Position.DRIVER);
        Person personSam = new Person("Sam", Position.BRANCH_DIRECTOR);
        dataBase.add(personBob);
        dataBase.add(personSam);
        System.out.println(dataBase);
        System.out.println(dataBase.findById(personBob.getId()));
        System.out.println(dataBase.findById(personSam.getId()));
        System.out.println(personBob + " isManager = " + dataBase.isManager(personBob));
        System.out.println(personSam + " isManager = " + dataBase.isManager(personSam));
        System.out.println(personBob + " isEmployee = " + dataBase.isEmployee(personBob.getId()));
        System.out.println(personSam + " isEmployee = " + dataBase.isEmployee(personSam.getId()));

        bubbleSort(new int[]{100, 2, 11, 5, 23, 7, 8, 1, -1, 24, 55, 9, 17, 43, 3});
        int[] array = new int[]{100, 2, 11, 5, 23, 7, 8, 1, -1, 24, 55, 9, 17, 43, 3};
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
