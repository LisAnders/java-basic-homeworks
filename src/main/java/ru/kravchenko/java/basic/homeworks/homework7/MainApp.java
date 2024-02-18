package ru.kravchenko.java.basic.homeworks.homework7;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Bob", 10);
        Car car = new Car(20);
        Horse horse = new Horse(30);
        OffRoadCar offRoadCar = new OffRoadCar(20);
        Bicycle bicycle = new Bicycle(human);

        human.setCurrentTransport(car);
        human.ride(Terrain.PLAIN, 10);
        human.ride(Terrain.FOREST, 10);

        human.setCurrentTransport(horse);
        human.ride(Terrain.FOREST, 15);
        human.ride(Terrain.SWAMP, 10);

        human.setCurrentTransport(offRoadCar);
        human.ride(Terrain.SWAMP, 10);
        human.ride(Terrain.FOREST, 10);
        human.ride(Terrain.PLAIN, 5);

        human.setCurrentTransport(bicycle);
        human.ride(Terrain.PLAIN, 5);
        human.ride(Terrain.SWAMP, 5);
        human.ride(Terrain.FOREST, 6);

        human.resetCurrentTransport();
        human.ride(Terrain.SWAMP, 5);
        human.ride(Terrain.PLAIN, 3);




    }
}
