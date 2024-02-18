package ru.kravchenko.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private int stamina;
    private Transport currentTransport;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Human(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void resetCurrentTransport() {
        this.currentTransport = null;
    }

    public boolean ride(Terrain terrain, int distance) {
        if (this.currentTransport != null) {
            return currentTransport.ride(terrain, distance);
        }
        if (this.stamina - distance < 0) {
            System.out.println("У человека недостаточно сил для преодоления дистанции: " + distance);
            return false;
        }
        this.stamina -= distance;
        System.out.println("Человек прошел пешком расстояние " + distance + " по местности: " + terrain);
        return true;
    }
}
