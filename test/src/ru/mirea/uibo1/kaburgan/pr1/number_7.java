package ru.mirea.uibo1.kaburgan.pr1;

public class number_7 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Факториал " + num + " = " + factorial(num));
    }
}
