package ru.mirea.uibo1.kaburgan.pr_9;

public class Main6 {

    public static void main(String[] args) {

        int n = 100000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * 100000);

        StopWatch sw = new StopWatch();
        sw.start();

        // Сортировка выбором
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        sw.stop();

        System.out.println("Время сортировки: " + sw.getElapsedTime() + " мс");
    }
}
