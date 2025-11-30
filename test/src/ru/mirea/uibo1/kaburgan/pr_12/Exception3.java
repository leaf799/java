package ru.mirea.uibo1.kaburgan.pr_12;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }
}
