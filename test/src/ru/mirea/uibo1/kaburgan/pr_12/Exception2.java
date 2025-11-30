package ru.mirea.uibo1.kaburgan.pr_12;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("You did not enter an integer!");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }
    }
}
