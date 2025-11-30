package ru.mirea.uibo1.kaburgan.pr_7;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date birthday;

    public Student(String name, int year, int month, int day) {
        this.name = name;
        this.birthday = new Date(year - 1900, month - 1, day);
    }

    public String formatBirthday(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(birthday);
    }

    @Override
    public String toString() {
        return "Студент: " + name +
                ", Дата рождения (полный формат): " +
                formatBirthday("EEEE, d MMMM yyyy");
    }
}
