package ru.mirea.uibo1.kaburgan.pr_9;

public class Main2 {

    public static class Test {

        int count;

        public static void main(String[] args) {
            Test t = new Test();
            System.out.println("5! = " + factorial(5));
            System.out.println("Count = " + t.getCount());
        }

        public int getCount() {
            return count;
        }

        public static int factorial(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        }
    }
}

