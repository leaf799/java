package ru.mirea.uibo1.kaburgan.pr_5.number_6;

public class Book implements Printable {
    private final String title;
    private final String author;
    public Book(String title, String author) { this.title = title; this.author = author; }
    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}