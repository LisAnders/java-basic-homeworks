package ru.kravchenko.java.basic.homeworks.homework7;

public class Bicycle implements Transport {
    private Human human;

    public Bicycle(Human human) {
        this.human = human;
    }

    public boolean ride(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("На велосипеде нельзя передвигаться по местности: " + terrain);
            return false;
        }
        if (human.getStamina() - distance < 0) {
            System.out.println("У человека недостаточно сил для передвижения на велосипеде на дистанцию: " + distance);
            return false;
        }
        human.setStamina(human.getStamina() - distance);
        System.out.println("Проехали на велосипеде на расстояние " + distance + " по местности: " + terrain);
        return true;
    }
}
