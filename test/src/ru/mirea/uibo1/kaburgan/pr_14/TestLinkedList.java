package ru.mirea.uibo1.kaburgan.pr_14;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Германия");
        list.add("Франция");
        list.addLast("Великобритания");
        list.addFirst("Испания");
        list.add(1, "Италия");

        System.out.println("Содержимое:");
        for (String s : list) System.out.println(s);

        System.out.println("Первый элемент: " + list.getFirst());
        System.out.println("Последний: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        list.remove("Франция");

        System.out.println("После удаления:");
        for (String s : list) System.out.println(s);
    }
}
