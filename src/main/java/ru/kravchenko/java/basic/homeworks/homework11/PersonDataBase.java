package ru.kravchenko.java.basic.homeworks.homework11;

import java.util.*;

public class PersonDataBase {
    private final Map<Long, Person> dataBase = new HashMap<>();
    private final Set<Position> managerPosition = new HashSet<>();

    public PersonDataBase() {
        managerPosition.add(Position.MANAGER);
        managerPosition.add(Position.DIRECTOR);
        managerPosition.add(Position.SENIOR_MANAGER);
        managerPosition.add(Position.BRANCH_DIRECTOR);

    }

    public void add(Person person) {
        dataBase.put(person.getId(), person);
    }

    public Person findById(Long id) {
        return dataBase.get(id);
    }

    public boolean isManager(Person person) {
        return managerPosition.contains(dataBase.get(person.getId()).getPosition());
    }

    public boolean isEmployee(Long id) {
        return !managerPosition.contains(dataBase.get(id).getPosition());
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "dataBase=" + dataBase +
                '}';
    }
}
