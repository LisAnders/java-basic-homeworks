package ru.kravchenko.java.basic.homeworks.homework5.animals;

public class Animal {
    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int stamina;

    public Animal(String name, float runSpeed, float swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public Animal(String name, float runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        if (this.stamina <= 0 || this.stamina - distance < 0) {
            System.out.println("Животное устало");
            return -1f;
        }
        this.stamina -= distance;
        float runTimeResult = distance / runSpeed;
        System.out.println("Животное: " + this.name + " пробежало дистанцию " + distance + " за " + runTimeResult + " секунд");
        return runTimeResult;
    }

    public float swim(int distance) {
        if (this.swimSpeed <= 0) {
            System.out.println("Животное не умеет плавать");
            return -1f;
        }
        if (this.stamina <= 0 || this.stamina - distance < 0) {
            System.out.println("Животное устало");
            return -1f;
        }
        this.stamina -= distance;
        float swimTimeResult = distance / this.swimSpeed;
        System.out.println("Животное: " + this.name + " проплыло дистанцию " + distance + " за " + swimTimeResult + " секунд");
        return swimTimeResult;
    }

    public void info() {
        System.out.println("Животное:\nИмя: " + this.name + "\nСкорость бега: " + this.runSpeed +
                " м/с\nСкорость плаванья: " + this.swimSpeed + " м/с\nВыносливость: " + this.stamina);
    }
}
