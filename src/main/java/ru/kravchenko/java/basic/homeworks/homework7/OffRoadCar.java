package ru.kravchenko.java.basic.homeworks.homework7;

public class OffRoadCar implements Transport {
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel += fuel;
    }

    public OffRoadCar(int fuel) {
        this.fuel = fuel;
    }

    public boolean ride(Terrain terrain, int distance) {
        if (this.fuel - distance < 0) {
            System.out.println("Недостаточно топлива для передвижения на дистанцию: " + distance);
            return false;
        }
        this.fuel -= distance;
        System.out.println("Проехали на вездеходе расстояние " + distance + " по местности: " + terrain);
        return true;
    }
}
