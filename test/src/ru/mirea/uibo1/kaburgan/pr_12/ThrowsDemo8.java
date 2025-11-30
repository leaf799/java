package ru.mirea.uibo1.kaburgan.pr_12;

import java.util.Scanner;

public class ThrowsDemo8 {

    public void getKey() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter key: ");
                String key = sc.nextLine();
                printDetails(key);
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try again!");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
