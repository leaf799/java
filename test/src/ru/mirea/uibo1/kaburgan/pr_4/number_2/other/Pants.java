package ru.mirea.uibo1.kaburgan.pr_4.number_2.other;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает штаны: " + this);
    }
}


