package ru.mirea.uibo1.kaburgan.pr_4.number_2.other;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает юбку: " + this);
    }
}
