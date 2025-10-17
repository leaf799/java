package ru.mirea.uibo1.kaburgan.pr_5.number_6;

public class Magazine implements Printable {
    private final String title;
    public Magazine(String title) { this.title = title; }
    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }
}
