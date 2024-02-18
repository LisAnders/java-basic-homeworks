package ru.kravchenko.java.basic.homeworks.homework8;

public class MainApp {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4" }, {"1", "2", "3", "4" }, {"1", "2", "a", "4" }, {"1", "2", "3", "4" }};
        try {

            System.out.println(sumArrayElements(array));
        } catch (AppArraySizeException e) {
            System.out.println("Некорректный размер массива");
        } catch (AppArrayDataException e) {
            System.out.println(e.getFormat());
        }
    }

    public static int sumArrayElements(String[][] array) {
        int result = 0;
        if (array.length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Некорректные данные в ячейке с адресом [" + i + "][" + j + "]");
                }

            }
        }
        return result;
    }

}
