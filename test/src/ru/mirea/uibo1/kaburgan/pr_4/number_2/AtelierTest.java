package ru.mirea.uibo1.kaburgan.pr_4.number_2;

import ru.mirea.uibo1.kaburgan.pr_4.number_2.other.*;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "Белый"),
                new Pants(Size.L, 2500, "Черный"),
                new Skirt(Size.S, 1800, "Красный"),
                new Tie(Size.XS, 900, "Синий")
        };

        System.out.println("=== Одеваем мужчин ===");
        Atelier.dressMan(clothes);

        System.out.println("\n=== Одеваем женщин ===");
        Atelier.dressWomen(clothes);
    }
}

