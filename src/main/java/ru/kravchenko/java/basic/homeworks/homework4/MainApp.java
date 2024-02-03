package ru.kravchenko.java.basic.homeworks.homework4;
import java.time.Year;
public class MainApp {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        User[] users = {
                new User("Тырыпыры", "Семен", "Юрьевич", 1982, "yoursemen@hoba.com"),
                new User("Накося", "Виктор", "Петрович", 1991, "nekosyak@taksyak.ru"),
                new User("Пелёна", "Алёна", "Максимовна", 1973, "alenapelena@bobaka.su"),
                new User("Дрейк", "Нейтан", "Салливич", 1976, "unchertyd@magnum.com"),
                new User("Гондоров", "Арагорн", "Араторнович", 2001, "dazdranagon@gimli.me"),
                new User("Леген", "Подожди-подожди", "Дарнович", 1994, "awesome@himym.com"),
                new User("Лупик", "Захар", "Александрович", 2014, "avotinet@tochka.org"),
                new User("Газманова", "Ольга", "Павловна", 1995, "olgazm@nova.de"),
                new User("Йегер", "Эрен", "Григорьевич", 1998, "hatetitans@levi.rk"),
                new User("Воробьев", "Евгений", "Игоревич", 1975, "jekvorobey@smekaesh.com"),
        };

        for (int i = 0; i<users.length; i++)
        {
            if(currentYear - users[i].getBirthYear() > 40) {
                users[i].userInfo();
            }
        }

        Box myBox = new Box(4,3,5,"красный");
        myBox.boxInfo();
        System.out.println("-----");
        myBox.setBoxColor("белый");
        System.out.println("-----");
        myBox.boxInfo();
        System.out.println("-----");
        myBox.putItemInBox("кот");
        System.out.println("-----");
        myBox.openBox();
        System.out.println("-----");
        myBox.putItemInBox("кот");
        System.out.println("-----");
        myBox.closeBox();
        System.out.println("-----");
        myBox.boxInfo();
        System.out.println("-----");
        myBox.throwItemFromBox();
        System.out.println("-----");
        myBox.openBox();
        System.out.println("-----");
        myBox.throwItemFromBox();
        System.out.println("-----");
        myBox.boxInfo();
        System.out.println("-----");
        myBox.throwItemFromBox();
    }
}
