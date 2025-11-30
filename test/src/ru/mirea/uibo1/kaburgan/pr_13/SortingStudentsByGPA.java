package ru.mirea.uibo1.kaburgan.pr_13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Сортировка по убыванию GPA: больший GPA должен идти раньше
        return Double.compare(s2.getGPA(), s1.getGPA());
    }

    // Внешний статический wrapper для вызова quickSort
    public static void quickSort(Student[] arr, Comparator<Student> comp) {
        if (arr == null || arr.length < 2) return;
        quickSort(arr, 0, arr.length - 1, comp);
    }

    private static void quickSort(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, comp);
            quickSort(arr, low, pivotIndex - 1, comp);
            quickSort(arr, pivotIndex + 1, high, comp);
        }
    }

    private static int partition(Student[] arr, int low, int high, Comparator<Student> comp) {
        Student pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // если arr[j] "меньше" pivot по компаратору (т.е. должен идти раньше), перемещаем в левую часть
            if (comp.compare(arr[j], pivot) < 0) {
                i++;
                Student tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // поместим pivot на правильную позицию
        Student tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
}

