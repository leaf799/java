package ru.mirea.uibo1.kaburgan.pr_7;

public class Task3 {
    public static void main(String[] args) {
        Student s = new Student("Иванов", 2004, 5, 15);

        System.out.println(s);
        System.out.println("Краткий формат: " + s.formatBirthday("dd.MM.yyyy"));
        System.out.println("Средний формат: " + s.formatBirthday("d MMM yyyy"));
        System.out.println("Полный формат: " + s.formatBirthday("EEEE, d MMMM yyyy"));
    }
}
