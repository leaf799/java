package ru.mirea.uibo1.kaburgan.pr_5.number_4;

public class Product implements Priceable {
    private final String title;
    private final double price;
    public Product(String title, double price) { this.title = title; this.price = price; }
    @Override public double getPrice() { return price; }
    @Override public String toString() { return title + " ("+price+")"; }
}