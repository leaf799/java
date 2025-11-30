package ru.mirea.uibo1.kaburgan.pr_13;

public class TestMerge {
    public static void main(String[] args) {
        Student[] a = {
                new Student(5, "Alex", 3.2),
                new Student(12, "Ivan", 3.8)
        };

        Student[] b = {
                new Student(1, "Maria", 4.0),
                new Student(9, "Oleg", 2.9)
        };

        // Объединяем и делаем merge sort (по iDNumber, т.к. compareTo реализован по iDNumber)
        Student[] mergedSorted = MergeSortStudents.mergeTwoAndSort(a, b);

        System.out.println("Merged & Sorted by ID:");
        for (Student s : mergedSorted) {
            System.out.println(s);
        }
    }
}
