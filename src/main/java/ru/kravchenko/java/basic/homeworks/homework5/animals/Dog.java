package ru.kravchenko.java.basic.homeworks.homework5.animals;

public class Dog extends Animal {

    private float swimSpeed;

    public Dog(String name, float runSpeed, float swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
    }

    public float swim(int distance) {
        if (this.stamina <= 0 || (this.stamina / 2) - distance < 0) {
            System.out.println("Животное устало");
            return -1;
        }
        this.stamina -= distance * 2;
        float swimTimeResult = distance / this.swimSpeed;
        System.out.println("Животное: " + this.name + " проплыло дистанцию " + distance + " за " + swimTimeResult + " секунд");
        return swimTimeResult;
    }

    @Override
    public void info() {
        System.out.println("Животное класса: Собака\nИмя: " + this.name + "\nСкорость бега: " + this.runSpeed +
                " м/с\nСкорость плаванья: " + this.swimSpeed + " м/с\nВыносливость: " + this.stamina);
    }
}
