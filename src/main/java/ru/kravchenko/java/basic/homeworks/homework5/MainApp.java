package ru.kravchenko.java.basic.homeworks.homework5;

import ru.kravchenko.java.basic.homeworks.homework5.animals.*;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Бантик", 2, 15);
        cat.run(10);
        cat.swim(5);
        cat.info();

        Dog dog = new Dog("Иви", 5, 3, 20);
        dog.run(7);
        dog.swim(5);
        dog.info();

        Horse horse = new Horse("Бо", 10, 5, 40);
        horse.run(10);
        horse.swim(10);
        horse.info();
    }
}
