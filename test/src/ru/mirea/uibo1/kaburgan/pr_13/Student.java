package ru.mirea.uibo1.kaburgan.pr_13;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        // Сравнение по iDNumber (возрастание)
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return String.format("%s (ID=%d, GPA=%.2f)", name, iDNumber, gpa);
    }
}

