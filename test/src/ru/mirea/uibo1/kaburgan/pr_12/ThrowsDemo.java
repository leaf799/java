package ru.mirea.uibo1.kaburgan.pr_12;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("data for " + key);

        } catch (NullPointerException e) {
            System.out.println("Caught inside method: " + e.getMessage());
        }
    }
}
