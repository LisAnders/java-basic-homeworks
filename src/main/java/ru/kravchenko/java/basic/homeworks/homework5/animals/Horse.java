package ru.kravchenko.java.basic.homeworks.homework5.animals;

public class Horse extends Animal {

    public Horse(String name, float runSpeed, float swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
        this.swimStaminaCost = 4;
    }


    @Override
    public void info() {
        System.out.println("Животное класса: Лошадь\nИмя: " + this.name + "\nСкорость бега: " + this.runSpeed +
                " м/с\nСкорость плаванья: " + this.swimSpeed + " м/с\nВыносливость: " + this.stamina);
    }
}
