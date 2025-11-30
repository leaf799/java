package ru.mirea.uibo1.kaburgan.pr_14;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("А");
        list.add("Б");
        list.add("В");
        list.add(1, "X");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
