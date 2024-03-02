package ru.kravchenko.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void add(String name, String phone_number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone_number);
        } else {
            Set<String> phone = new HashSet<>();
            phone.add(phone_number);
            phoneBook.put(name, phone);
        }
    }

    public String find(String name) {
        if (phoneBook.containsKey(name)) {
            return name + ": " + phoneBook.get(name).toString();
        }
        return "Имени " + name + " нет в справочнике";
    }

    public String containsPhoneNumber(String phone_number) {
        for (Set<String> phones : phoneBook.values()) {
            if (phones.contains(phone_number)) {
                return "Номер " + phone_number + " содержится в справочнике";
            }
        }
        return "Номера " + phone_number + " нет в справочнике";
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }
}
