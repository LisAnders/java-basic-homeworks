package ru.kravchenko.java.basic.homeworks.homework6;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 7),
                new Cat("Персик", 3),
                new Cat("Савелий", 4),
                new Cat("Борис", 8)
        };
        feedCats(cats, plate);
        plate.info();
        plate.addFoodInPlate(20);

        feedCats(cats, plate);
        plate.info();
        plate.addFoodInPlate(30);

        feedCats(cats, plate);
        plate.info();
        plate.addFoodInPlate(2);

        feedCats(cats, plate);
        plate.info();
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
    }
}
