package ru.mirea.uibo1.kaburgan.pr_14;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("output.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

