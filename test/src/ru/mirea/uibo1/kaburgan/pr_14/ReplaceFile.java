package ru.mirea.uibo1.kaburgan.pr_14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите новый текст: ");
        String text = sc.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(text);
            System.out.println("Файл заменён.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
