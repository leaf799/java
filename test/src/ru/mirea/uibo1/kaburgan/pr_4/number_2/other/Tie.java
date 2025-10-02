package ru.mirea.uibo1.kaburgan.pr_4.number_2.other;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук: " + this);
    }
}

