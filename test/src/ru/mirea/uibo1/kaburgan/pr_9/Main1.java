package ru.mirea.uibo1.kaburgan.pr_9;

public class Main1 {

    public static class F {
        int i;
        static String s = "Hello";
        void imethod() { System.out.println("Instance method"); }
        static void smethod() { System.out.println("Static method"); }
    }

    public static void main(String[] args) {
        F f = new F();

        System.out.println(f.i);       // OK
        System.out.println(f.s);       // OK (но лучше F.s)
        f.imethod();                   // OK
        f.smethod();                   // OK, но лучше F.smethod()
        // System.out.println(F.i);    // Ошибка
        System.out.println(F.s);       // OK
        // F.imethod();                // Ошибка
        F.smethod();                   // OK
    }
}
