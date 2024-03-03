package ru.kravchenko.java.basic.homeworks.homework11;

public class QuickSort {
    public static void quickSort(int[] array, int first, int last) {
        if (first < last) {
            int rightSide = first;
            int leftSide = last;
            int pivot = array[first];
            while (rightSide < leftSide) {
                while (array[rightSide] < pivot) {
                    rightSide++;
                }
                while (array[leftSide] > pivot) {
                    leftSide--;
                }
                if (rightSide <= leftSide) {
                    int temp = array[rightSide];
                    array[rightSide] = array[leftSide];
                    array[leftSide] = temp;
                    rightSide++;
                    leftSide--;
                }
            }
            quickSort(array, first, leftSide);
            quickSort(array, rightSide, last);
        }
    }
}
