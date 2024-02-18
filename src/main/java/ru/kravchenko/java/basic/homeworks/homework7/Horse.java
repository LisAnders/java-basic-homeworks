package ru.kravchenko.java.basic.homeworks.homework7;

public class Horse implements Transport {
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }


    public boolean ride(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может передвигаться по местности: " + terrain);
            return false;
        }
        if (this.stamina - distance < 0) {
            System.out.println("Недостаточно сил для предвижения");
            return false;
        }
        this.stamina -= distance;
        System.out.println("Проскакали на лошади расстояние: " + distance);
        return true;
    }


}
