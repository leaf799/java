package ru.mirea.uibo1.kaburgan.pr1;

public class number_6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%d = %.3f%n", i, 1.0 / i);
        }
    }
}
