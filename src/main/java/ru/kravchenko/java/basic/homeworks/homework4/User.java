package ru.kravchenko.java.basic.homeworks.homework4;

public class User {
    private String lastName;
    private String firstName;
    private String fatherName;
    private int birthYear;
    private String email;

    public int getBirthYear() {
        return birthYear;
    }

    public User(String lastName, String firstName, String fatherName, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void userInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + fatherName + "\n"
                + "Год рождения: " + birthYear + "\n" + "e-mail: " + email);
    }


}
