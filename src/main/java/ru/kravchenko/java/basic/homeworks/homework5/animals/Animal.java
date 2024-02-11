package ru.kravchenko.java.basic.homeworks.homework5.animals;

public class Animal {
    protected String name;
    protected float runSpeed;
    protected int stamina;

    public Animal(String name, float runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        if (this.stamina <= 0 || this.stamina - distance < 0) {
            System.out.println("Животное устало");
            return -1;
        }
        this.stamina -= distance;
        float runTimeResult = distance / runSpeed;
        System.out.println("Животное: " + this.name + " пробежало дистанцию " + distance + " за " + runTimeResult + " секунд");
        return runTimeResult;
    }

    public void info() {
        System.out.println("Животное: " + this.name + "\nВыносливость = " + this.stamina);
    }
}
