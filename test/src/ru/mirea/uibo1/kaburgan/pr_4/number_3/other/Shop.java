package ru.mirea.uibo1.kaburgan.pr_4.number_3.other;

// Shop.java
import java.util.*;

public class Shop {
    private static final String LOGIN = "user";
    private static final String PASSWORD = "1234";

    private List<Product> products = new ArrayList<>();
    private List<Product> cart = new ArrayList<>();

    public Shop() {
        products.add(new Product("iPhone", 80000, Category.PHONES));
        products.add(new Product("Samsung Galaxy", 60000, Category.PHONES));
        products.add(new Product("MacBook", 120000, Category.LAPTOPS));
        products.add(new Product("Lenovo ThinkPad", 90000, Category.LAPTOPS));
        products.add(new Product("Java для начинающих", 1500, Category.BOOKS));
        products.add(new Product("Clean Code", 2000, Category.BOOKS));
    }

    public boolean login(Scanner sc) {
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String pass = sc.nextLine();
        return login.equals(LOGIN) && pass.equals(PASSWORD);
    }

    public void showCategories() {
        System.out.println("Категории товаров:");
        for (Category c : Category.values()) {
            System.out.println("- " + c);
        }
    }

    public void showProductsByCategory(Category category) {
        for (Product p : products) {
            if (p.getCategory() == category) {
                System.out.println(p);
            }
        }
    }

    public void addToCart(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                cart.add(p);
                System.out.println("Добавлено в корзину: " + p);
                return;
            }
        }
        System.out.println("Товар не найден!");
    }

    public void checkout() {
        double total = 0;
        System.out.println("Покупка:");
        for (Product p : cart) {
            System.out.println("- " + p);
            total += p.getPrice();
        }
        System.out.println("Итого: " + total + "₽");
        cart.clear();
    }
}


