package ru.mirea.uibo1.kaburgan.pr_5.number_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ComputerShop {
    private final List<Computer> stock = new ArrayList<>();

    public void addComputer(Computer c) { stock.add(c); }
    public boolean removeComputer(Computer c) { return stock.remove(c); }

    public Optional<Computer> findByBrandAndPrice(Brand brand, double maxPrice) {
        return stock.stream().filter(c -> c.getBrand() == brand && c.getPrice() <= maxPrice).findFirst();
    }

    public void printAll() { stock.forEach(System.out::println); }

    public static void main(String[] args) {
        ComputerShop shop = new ComputerShop();
        shop.addComputer(new Computer(Brand.DELL, new Processor("i5-1135G7", 2.4), new Memory(16), new Monitor(15.6), 70000));
        shop.addComputer(new Computer(Brand.LENOVO, new Processor("Ryzen 5 4600U", 2.1), new Memory(8), new Monitor(14), 55000));
        System.out.println("All computers:");
        shop.printAll();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите бренд (DELL/HP/LENOVO/ASUS/ACER/APPLE): ");
        String b = sc.nextLine().trim().toUpperCase();
        System.out.print("Введите макс. цену: ");
        double max = Double.parseDouble(sc.nextLine().trim());
        try {
            Brand brand = Brand.valueOf(b);
            shop.findByBrandAndPrice(brand, max).ifPresentOrElse(
                    c -> System.out.println("Найден: " + c),
                    () -> System.out.println("Не найдено")
            );
        } catch (IllegalArgumentException ex) {
            System.out.println("Неверный бренд");
        }
        sc.close();
    }
}
