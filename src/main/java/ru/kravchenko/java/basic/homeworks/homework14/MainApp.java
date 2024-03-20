package ru.kravchenko.java.basic.homeworks.homework14;


public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100000000];
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println("Время выполнения в 1 поток: " + (timeFinish - timeStart));

        double[] arrayThread = new double[100000000];
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25000000; i++) {
                    arrayThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 25000000; i < 50000000; i++) {
                    arrayThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50000000; i < 75000000; i++) {
                    arrayThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 75000000; i < 100000000; i++) {
                    arrayThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        timeStart = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        timeFinish = System.currentTimeMillis();
        System.out.println("Время выполнения в 4 потока: " + (timeFinish - timeStart));
    }
}
