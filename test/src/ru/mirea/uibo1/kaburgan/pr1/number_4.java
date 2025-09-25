package ru.mirea.uibo1.kaburgan.pr1;
import java.util.Scanner;
public class number_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, sum = 0;
        while (i < n) {
            sum += arr[i];
            i++;
        }

        int max = arr[0], min = arr[0];
        int j = 1;
        do {
            if (arr[j] > max) max = arr[j];
            if (arr[j] < min) min = arr[j];
            j++;
        } while (j < n);

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
