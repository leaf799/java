package ru.mirea.uibo1.kaburgan.pr_14;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Германия");
        list.add("Франция");
        list.add("Испания");
        list.add(1, "Италия");

        System.out.println("Элемент с индексом 1: " + list.get(1));

        list.set(1, "Польша");

        System.out.println("Содержимое списка:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Размер списка: " + list.size());

        list.remove("Испания");
        list.remove(0);

        System.out.println("После удаления:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
