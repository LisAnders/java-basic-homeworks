package ru.kravchenko.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while (start) {
            try (Socket socket = new Socket("localhost", 8080)) {
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                String result = inputStream.readUTF();
                System.out.println(result);
                System.out.print("-> ");
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    inputStream.close();
                    outputStream.close();
                    start = false;
                } else {
                    outputStream.writeUTF(input);
                    outputStream.flush();
                    result = inputStream.readUTF();
                    System.out.println(result);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
