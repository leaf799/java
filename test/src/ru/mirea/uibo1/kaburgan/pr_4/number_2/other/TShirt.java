package ru.mirea.uibo1.kaburgan.pr_4.number_2.other;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает футболку: " + this);
    }
}

