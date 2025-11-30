package ru.mirea.uibo1.kaburgan.pr_7;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите: год месяц число");
        int year = sc.nextInt();
        int month = sc.nextInt() - 1;
        int day = sc.nextInt();

        System.out.println("Введите: часы минуты");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Date date = new Date(year - 1900, month, day, hour, minute);
        System.out.println("Созданный объект Date: " + date);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute);
        System.out.println("Созданный объект Calendar: " + cal.getTime());
    }
}

