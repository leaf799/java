package ru.mirea.uibo1.kaburgan.pr_11;

import java.util.Scanner;

public class Practice8 {

    // ------------ 1. Треугольная последовательность -----------------
    public static void triangleSeq(int n) {
        int k = 1, count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(k + " ");
            count++;
            if (count == k) {
                k++;
                count = 0;
            }
        }
        System.out.println();
    }

    // ------------ 2. Числа от 1 до n -----------------
    public static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    // ------------ 3. От A до B -----------------
    public static void printAToB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) return;
        printAToB(a < b ? a + 1 : a - 1, b);
    }

    // ------------ 4. k-значные числа с суммой цифр s -----------------
    public static int countNumbers(int k, int s) {
        return countRec(k, s, true);
    }

    private static int countRec(int k, int s, boolean first) {
        if (k == 0) return s == 0 ? 1 : 0;
        int total = 0;
        int start = first ? 1 : 0;
        for (int d = start; d <= 9; d++) {
            if (s - d >= 0) total += countRec(k - 1, s - d, false);
        }
        return total;
    }

    // ------------ 5. Сумма цифр числа -----------------
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    // ------------ 6. Проверка числа на простоту -----------------
    public static boolean isPrime(int n) {
        return primeCheck(n, 2);
    }

    private static boolean primeCheck(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return primeCheck(n, d + 1);
    }

    // ------------ 7. Разложение на множители -----------------
    public static void factorize(int n) {
        factor(n, 2);
        System.out.println();
    }

    private static void factor(int n, int d) {
        if (n == 1) return;
        if (n % d == 0) {
            System.out.print(d + " ");
            factor(n / d, d);
        } else {
            factor(n, d + 1);
        }
    }

    // ------------ 8. Палиндром -----------------
    public static boolean isPalindrome(String s) {
        return palCheck(s, 0, s.length() - 1);
    }

    private static boolean palCheck(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return palCheck(s, l + 1, r - 1);
    }

    // ------------ 9. Последовательности без двух нулей -----------------
    public static int noZeroPairs(int a, int b) {
        return noZeroRec(a, b, 1);
    }

    private static int noZeroRec(int a, int b, int canZero) {
        if (a == 0 && b == 0) return 1;
        int total = 0;
        if (b > 0) total += noZeroRec(a, b - 1, 1);
        if (a > 0 && canZero == 1) total += noZeroRec(a - 1, b, 0);
        return total;
    }

    // ------------ 10. Разворот числа без строк -----------------
    public static int reverseNumber(int n) {
        return reverseRec(n, 0);
    }

    private static int reverseRec(int n, int res) {
        if (n == 0) return res;
        return reverseRec(n / 10, res * 10 + n % 10);
    }

    // ------------ 11. Количество единиц до двух нулей -----------------
    public static int countOnes() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            int b = sc.nextInt();
            if (b == 0) return 0;
            return (b == 1 ? 1 : 0) + countOnes();
        }
        return (a == 1 ? 1 : 0) + countOnes();
    }

    // ------------ 12. Вывести нечётные числа -----------------
    public static void printOdd() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) return;
        if (x % 2 == 1) System.out.print(x + " ");
        printOdd();
    }

    // ------------ 13. Вывести элементы с нечётными номерами -----------------
    public static void printOddIndex() {
        printOddIndexRec(1);
    }

    private static void printOddIndexRec(int idx) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) return;
        if (idx % 2 == 1) System.out.print(x + " ");
        printOddIndexRec(idx + 1);
    }

    // ------------ 14. Цифры числа слева направо -----------------
    public static void printLeft(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printLeft(n / 10);
        System.out.print(n % 10 + " ");
    }

    // ------------ 15. Цифры числа справа налево -----------------
    public static void printRight(int n) {
        System.out.print(n % 10 + " ");
        if (n >= 10) printRight(n / 10);
    }

    // ------------ 16. Количество элементов, равных максимуму -----------------
    public static int[] countMax() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) return new int[]{0, 0};
        int[] next = countMax();
        if (x > next[0]) return new int[]{x, 1};
        if (x == next[0]) return new int[]{x, next[1] + 1};
        return next;
    }

    // ------------ 17. Максимум последовательности -----------------
    public static int maxSeq() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) return 0;
        return Math.max(x, maxSeq());
    }

    // ------------ main() для примера -----------------
    public static void main(String[] args) {
        // Здесь можешь запускать тесты:
        // triangleSeq(10);
        // print1toN(5);
        // printAToB(8, 3);
        // System.out.println(countNumbers(2, 5));
        // System.out.println(sumDigits(1234));
        // System.out.println(isPrime(29));
        // factorize(84);
        // System.out.println(isPalindrome("abba"));
        // System.out.println(noZeroPairs(2, 2));
        // System.out.println(reverseNumber(12345));
        // printOdd();
        // printOddIndex();
        // printLeft(5321);
        // printRight(5321);
        // int[] r = countMax(); System.out.println(r[1]);
        // System.out.println(maxSeq());
    }
}
