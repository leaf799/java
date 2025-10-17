package ru.mirea.uibo1.kaburgan.pr_5.number_11;

import java.util.Scanner;

/**
 * Запуск для задания 11: конвертация температуры.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях: ");
        double c = Double.parseDouble(sc.nextLine().trim());

        Convertable toK = new CelsiusToKelvin();
        Convertable toF = new CelsiusToFahrenheit();

        System.out.printf("Кельвин: %.2f K%n", toK.convert(c));
        System.out.printf("Фаренгейт: %.2f °F%n", toF.convert(c));
        sc.close();
    }
}
