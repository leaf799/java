package ru.mirea.uibo1.kaburgan.pr_5.number_4;

public class Main {
    public static void main(String[] args) {
        Priceable[] items = { new Product("Книга", 499.9), new Product("Наушники", 2999.0) };
        for (Priceable p : items) System.out.println(p + " price = " + p.getPrice());
    }
}