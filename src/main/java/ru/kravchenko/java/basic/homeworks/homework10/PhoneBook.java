package ru.kravchenko.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> directory = new HashMap<>();

    public PhoneBook() {
    }

    public void add(String name, String phoneNumber) {
        if (directory.containsKey(name)) {
            directory.get(name).add(phoneNumber);
        } else {
            Set<String> phone = new HashSet<>();
            phone.add(phoneNumber);
            directory.put(name, phone);
        }
    }

    public String find(String name) {
        if (directory.containsKey(name)) {
            return name + ": " + directory.get(name).toString();
        }
        return "Имени " + name + " нет в справочнике";
    }

    public String containsPhoneNumber(String phoneNumber) {
        for (Set<String> phones : directory.values()) {
            if (phones.contains(phoneNumber)) {
                return "Номер " + phoneNumber + " содержится в справочнике";
            }
        }
        return "Номера " + phoneNumber + " нет в справочнике";
    }

    @Override
    public String toString() {
        return directory.toString();
    }
}
