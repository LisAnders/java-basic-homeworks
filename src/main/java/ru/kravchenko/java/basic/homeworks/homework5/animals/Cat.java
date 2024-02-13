package ru.kravchenko.java.basic.homeworks.homework5.animals;

public class Cat extends Animal {
    public Cat(String name, float runSpeed, int stamina) {
        super(name, runSpeed, stamina);
    }

    @Override
    public void info() {
        System.out.println("Животное класса: Кот\nИмя: " + this.name + "\nСкорость бега: " + this.runSpeed +
                " м/с\nВыносливость: " + this.stamina);
    }
}
