package ru.mirea.uibo1.kaburgan.pr_4.number_3;

// ShopTest.java
import ru.mirea.uibo1.kaburgan.pr_4.number_3.other.Category;
import ru.mirea.uibo1.kaburgan.pr_4.number_3.other.Shop;

import java.util.*;

public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        if (!shop.login(sc)) {
            System.out.println("Неверный логин или пароль!");
            return;
        }

        shop.showCategories();
        System.out.print("Выберите категорию (PHONES/LAPTOPS/BOOKS): ");
        Category c = Category.valueOf(sc.nextLine().toUpperCase());
        shop.showProductsByCategory(c);

        System.out.print("Введите название товара для добавления в корзину: ");
        shop.addToCart(sc.nextLine());

        shop.checkout();
    }
}


