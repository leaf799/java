package ru.mirea.uibo1.kaburgan.pr_7;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        int n = 200_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start, end;

        // ---------- ОПЕРАЦИЯ ДОБАВЛЕНИЯ ----------
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) arrayList.add(i);
        end = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (end - start) + " ms");


        // ---------- ОПЕРАЦИЯ ВСТАВКИ ----------
        start = System.currentTimeMillis();
        arrayList.add(n / 2, 999999);
        end = System.currentTimeMillis();
        System.out.println("ArrayList insert middle: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.add(n / 2, 999999);
        end = System.currentTimeMillis();
        System.out.println("LinkedList insert middle: " + (end - start) + " ms");


        // ---------- ОПЕРАЦИЯ УДАЛЕНИЯ ----------
        start = System.currentTimeMillis();
        arrayList.remove(n / 3);
        end = System.currentTimeMillis();
        System.out.println("ArrayList remove middle: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(n / 3);
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove middle: " + (end - start) + " ms");


        // ---------- ОПЕРАЦИЯ ПОИСКА ----------
        start = System.currentTimeMillis();
        arrayList.contains(150000);
        end = System.currentTimeMillis();
        System.out.println("ArrayList contains: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.contains(150000);
        end = System.currentTimeMillis();
        System.out.println("LinkedList contains: " + (end - start) + " ms");
    }
}

