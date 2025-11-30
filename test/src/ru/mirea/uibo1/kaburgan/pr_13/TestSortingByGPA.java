package ru.mirea.uibo1.kaburgan.pr_13;

import java.util.Arrays;

public class TestSortingByGPA {
    public static void main(String[] args) {
        Student[] students = {
                new Student(10, "Alex", 3.5),
                new Student(3, "Oleg", 4.2),
                new Student(22, "Maria", 3.9),
                new Student(7, "Ivan", 2.8),
                new Student(5, "Nina", 4.2)
        };

        System.out.println("Before quickSort:");
        for (Student s : students) System.out.println(s);

        // Сортируем по убыванию GPA
        SortingStudentsByGPA.quickSort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter quickSort (by GPA desc):");
        for (Student s : students) System.out.println(s);

        // Если нужно — можно ещё проверить стабильность или дополнительно использовать Arrays.sort:
        // Arrays.sort(students, new SortingStudentsByGPA());
    }
}
