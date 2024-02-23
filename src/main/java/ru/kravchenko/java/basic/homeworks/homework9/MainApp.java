package ru.kravchenko.java.basic.homeworks.homework9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(sequenceArrayList(3, 20));
        System.out.println(sumListElements(new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 7))));
        System.out.println(setListElements(2, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println(increaseListElements(10, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));

        Employee bob = new Employee("Bob", 30);
        Employee pete = new Employee("Pete", 23);
        Employee tom = new Employee("Tom", 45);
        Employee sam = new Employee("Sam", 20);
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(bob, pete, tom, sam));

        System.out.println(getEmployeeNames(employees));
        System.out.println(getEmployeesByMinAge(25, employees));
        checkEmployeeAverageAge(20, employees);
        Employee youngestEmployee = getYoungestEmployee(employees);
        System.out.println(youngestEmployee.toString());

    }

    public static ArrayList<Integer> sequenceArrayList(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int sumListElements(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                result += list.get(i);
            }
        }
        return result;
    }

    public static ArrayList<Integer> setListElements(int num, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, num);
        }
        return arrayList;
    }

    public static ArrayList<Integer> increaseListElements(int num, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + num);
        }
        return arrayList;
    }

    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static ArrayList<Employee> getEmployeesByMinAge(int minAge, ArrayList<Employee> employees) {
        ArrayList<Employee> employeesByMinAge = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                employeesByMinAge.add(employee);
            }
        }
        return employeesByMinAge;
    }

    public static void checkEmployeeAverageAge(int minAverageAge, ArrayList<Employee> employees) {
        int averageAge = 0;
        for (Employee employee : employees) {
            averageAge += employee.getAge() / employees.size();
        }
        if (minAverageAge <= averageAge) {
            System.out.println("Указанный минимальный средний возраст: " + minAverageAge + " не превышает средний возраст сотрудников: " + averageAge);
        } else {
            System.out.println("Указанный минимальный средний возраст: " + minAverageAge + " превышает средний возраст сотрудников: " + averageAge);
        }
    }

    public static Employee getYoungestEmployee(ArrayList<Employee> employees) {
        Employee youngestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}
