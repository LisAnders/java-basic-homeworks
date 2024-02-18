package ru.kravchenko.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel += fuel;
    }

    public Car(int fuel) {
        this.fuel = fuel;
    }


    public boolean ride(Terrain terrain, int distance) {
        if (terrain == Terrain.FOREST || terrain == Terrain.SWAMP) {
            System.out.println("Машина не может передвигаться по местности: " + terrain);
            return false;
        }
        if (this.fuel - distance < 0) {
            System.out.println("Недостаточно топлива для передвижения");
            return false;
        }
        this.fuel -= distance;
        System.out.println("Машина проехала на расстояние: " + distance);
        return true;
    }
}
