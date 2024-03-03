package ru.kravchenko.java.basic.homeworks.homework11;

public class Person {
    private String name;
    private Position position;
    private Long id;

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    public Person(String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = (long) (Math.random() * 1000000);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", id=" + id +
                '}';
    }
}
