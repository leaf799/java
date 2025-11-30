package ru.mirea.uibo1.kaburgan.pr_13;

public class MergeSortStudents {

    public static Student[] mergeSort(Student[] arr) {
        if (arr == null || arr.length < 2) return arr;
        return mergeSortRecursive(arr, 0, arr.length - 1);
    }

    private static Student[] mergeSortRecursive(Student[] arr, int left, int right) {
        if (left == right) {
            Student[] single = new Student[1];
            single[0] = arr[left];
            return single;
        }

        int mid = (left + right) / 2;
        Student[] leftArr = mergeSortRecursive(arr, left, mid);
        Student[] rightArr = mergeSortRecursive(arr, mid + 1, right);
        return merge(leftArr, rightArr);
    }

    private static Student[] merge(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    // Вспомогательный метод для объединения двух массивов и сортировки
    public static Student[] mergeTwoAndSort(Student[] a, Student[] b) {
        Student[] combined = new Student[a.length + b.length];
        System.arraycopy(a, 0, combined, 0, a.length);
        System.arraycopy(b, 0, combined, a.length, b.length);
        return mergeSort(combined);
    }
}

