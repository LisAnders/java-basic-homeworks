package ru.kravchenko.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        boolean start = true;
        ServerSocket socket = new ServerSocket(8080);
        while (start) {
            try (Socket clientSocket = socket.accept()) {
                DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
                outputStream.writeUTF("Сервер выполняет математические вычисления \n Доступные операции +, -, *, / \n Пример ввода -> \"2 + 2\"");
                outputStream.flush();
                String userInput = inputStream.readUTF();
                String result = calculate(userInput);
                outputStream.writeUTF("Результат: " + result + "\n");
                outputStream.flush();
            } catch (IOException e) {

            }
        }
    }

    public static String calculate(String input) {
        String[] stringArr = input.split(" ");
        int num1 = Integer.parseInt(stringArr[0]);
        int num2 = Integer.parseInt(stringArr[2]);
        String result;
        switch (stringArr[1]) {
            case "+":
                result = String.valueOf(num1 + num2);
                break;
            case "-":
                result = String.valueOf(num1 - num2);
                break;
            case "*":
                result = String.valueOf(num1 * num2);
                break;
            case "/":
                result = String.valueOf(num1 / num2);
                break;
            default:
                result = "Некорректный знак: " + stringArr[1];
                break;
        }
        return result;
    }
}
