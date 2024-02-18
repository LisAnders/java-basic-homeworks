package ru.kravchenko.java.basic.homeworks.homework8;

public class AppArrayDataException extends RuntimeException {
    private String format;

    public String getFormat() {
        return format;
    }

    public AppArrayDataException(String format) {
        this.format = format;
    }
}
