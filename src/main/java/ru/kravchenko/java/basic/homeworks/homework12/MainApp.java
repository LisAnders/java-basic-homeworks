package ru.kravchenko.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainApp {
    static String ROOT_DIR = ".";
    static String FILE_FORMAT = ".txt";

    public static void main(String[] args) {
        File dir = new File(ROOT_DIR);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Set<String> files = getTxtFiles(dir);
            if (files.isEmpty()) {
                System.out.println("Нет файлов в каталоге : " + dir.getAbsolutePath());
                System.out.println("Создать новый txt файл? (y/n)");
                System.out.print("-> ");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    createOrEditTxtFile();
                } else if (input.equals("n")) {
                    System.out.println("Пока!");
                    break;
                } else {
                    continue;
                }

            } else {
                System.out.println("Содержимое каталога " + dir.getAbsolutePath() + ":");
                for (String file : files) {
                    System.out.println(file);
                }
                System.out.println("\n * edit - изменить/создать файл \n * tree - древо каталогов \n * exit - выход");
                System.out.print("-> ");
                String input = scanner.nextLine();
                if (input.equals("edit")) {
                    createOrEditTxtFile();
                } else if (input.equals("tree")) {
                    showCatalogTree(ROOT_DIR, "");
                } else if (input.equals("exit")) {
                    System.out.println("Пока!");
                    break;
                } else {
                    continue;
                }
            }
        }

    }

    public static Set<String> getTxtFiles(File dir) {
        Set<String> files = new HashSet<>();
        for (File file : dir.listFiles()) {
            if (file.isFile() && file.getName().contains(FILE_FORMAT)) {
                files.add(file.getName());
            }
        }
        return files;
    }

    public static void createOrEditTxtFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла для записи: ");
        String fileName = scanner.nextLine();
        System.out.println("Содержимое файла: ");
        readFile(fileName);
        System.out.println("Введите текст: ");
        System.out.print("-> ");
        String inputText = scanner.nextLine();
        writeFile(fileName, inputText);
    }

    public static void writeFile(String fileName, String inputString) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName + FILE_FORMAT, true))) {
            byte[] buffer = inputString.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName + FILE_FORMAT);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            System.out.println(" ** отсутствует ** ");
        } finally {
            System.out.println();
        }
    }

    public static void showCatalogTree(String path, String indent) {
        File dir = new File(path);
        indent += "|-";
        if (dir.exists()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory() && !file.getName().contains(".")) {
                    System.out.println(indent + ">" + file.getName());
                    showCatalogTree(file.getAbsolutePath(), indent);
                }
                if (file.isFile()) {
                    System.out.println(indent + " " + file.getName());
                }
            }
        }
    }
}
