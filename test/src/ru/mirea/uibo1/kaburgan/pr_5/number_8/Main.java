package ru.mirea.uibo1.kaburgan.pr_5.number_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях: ");
        double c = Double.parseDouble(sc.nextLine());
        Convertable toK = new CelsiusToKelvin();
        Convertable toF = new CelsiusToFahrenheit();
        System.out.printf("Kelvin: %.2f%nFahrenheit: %.2f%n", toK.convert(c), toF.convert(c));
        sc.close();
    }
}
