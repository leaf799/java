package ru.mirea.uibo1.kaburgan.pr_5.number_3;

public class Main {
    public static void main(String[] args) {
        Nameable[] arr = { new Planet("Марс"), new Car("Tesla Model 3") };
        for (Nameable n : arr) System.out.println("Nameable: " + n.getName());
    }
}