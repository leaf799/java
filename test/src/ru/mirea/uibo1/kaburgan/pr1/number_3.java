package ru.mirea.uibo1.kaburgan.pr1;

public class number_3 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}


