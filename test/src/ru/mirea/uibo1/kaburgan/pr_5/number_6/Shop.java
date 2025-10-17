package ru.mirea.uibo1.kaburgan.pr_5.number_6;

public class Shop implements Printable {
    private final String name;
    public Shop(String name) { this.name = name; }
    @Override
    public void print() {
        System.out.println("Shop: " + name);
    }

    public static void main(String[] args) {
        Printable[] arr = {
                new Book("Программирование на Java", "Иванов"),
                new Magazine("Наука и Жизнь"),
                new Shop("BookStore")
        };
        for (Printable p : arr) p.print();
    }
}
