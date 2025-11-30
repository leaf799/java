package ru.mirea.uibo1.kaburgan.pr_14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст для добавления: ");
        String text = sc.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.append("\n").append(text);
            System.out.println("Текст добавлен.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
