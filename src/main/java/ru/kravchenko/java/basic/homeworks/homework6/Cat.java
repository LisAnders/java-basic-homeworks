package ru.kravchenko.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (!isFull) {
            if (plate.decreaseFoodInPlate(appetite)) {
                isFull = true;
            }
        }
    }

    public void info() {
        System.out.println("Кот: " + name + ((isFull) ? " сыт" : " голоден"));
    }

}
