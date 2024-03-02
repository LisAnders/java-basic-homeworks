package ru.kravchenko.java.basic.homeworks.homework10;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bob", "929291100");
        phoneBook.add("Bob", "929292100");
        phoneBook.add("Sam", "8239292100");
        System.out.println(phoneBook);
        System.out.println(phoneBook.find("Bob"));
        System.out.println(phoneBook.find("Sam"));
        System.out.println(phoneBook.find("Pete"));
        System.out.println(phoneBook.containsPhoneNumber("929291100"));
        System.out.println(phoneBook.containsPhoneNumber("92929113100"));

    }
}
