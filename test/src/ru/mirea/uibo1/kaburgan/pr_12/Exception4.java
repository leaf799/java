package ru.mirea.uibo1.kaburgan.pr_12;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (Exception e) {
            System.out.println("Error: " + e);

        } finally {
            System.out.println("Finally block executed");
        }
    }
}

