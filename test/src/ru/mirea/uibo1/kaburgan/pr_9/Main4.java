package ru.mirea.uibo1.kaburgan.pr_9;

public class Main4 {

    public static void main(String[] args) {

        java.util.Date[] dates = new java.util.Date[10];

        System.out.println(dates[0]);  // null

        if (dates[0] != null)
            System.out.println(dates[0].toString());
        else
            System.out.println("dates[0] == null, вызов toString невозможен");
    }
}

