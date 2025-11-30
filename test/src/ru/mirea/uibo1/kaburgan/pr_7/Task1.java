package ru.mirea.uibo1.kaburgan.pr_7;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developer = "Иванов"; // фамилия разработчика
        Date getDate = new Date(2024 - 1900, 10, 20, 10, 30); // дата получения задания (пример)
        Date submitDate = new Date(); // текущая дата – дата сдачи

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + getDate);
        System.out.println("Дата сдачи задания: " + submitDate);
    }
}
