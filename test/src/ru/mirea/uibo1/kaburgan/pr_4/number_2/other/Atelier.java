package ru.mirea.uibo1.kaburgan.pr_4.number_2.other;

// Atelier.java
public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }
}

