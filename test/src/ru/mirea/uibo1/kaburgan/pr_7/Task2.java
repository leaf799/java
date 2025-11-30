package ru.mirea.uibo1.kaburgan.pr_7;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату (год месяц день): ");
        int y = sc.nextInt();
        int m = sc.nextInt() - 1;
        int d = sc.nextInt();

        Date userDate = new Date(y - 1900, m, d);
        Date now = new Date();

        System.out.println("Текущая дата: " + now);
        System.out.println("Введённая дата: " + userDate);

        if (userDate.after(now))
            System.out.println("Введённая дата ПОЗЖЕ текущей.");
        else if (userDate.before(now))
            System.out.println("Введённая дата РАНЬШЕ текущей.");
        else
            System.out.println("Даты совпадают.");
    }
}

