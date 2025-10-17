package ru.mirea.uibo1.kaburgan.pr_5.number_7;

import java.util.Objects;

public class Computer {
    private final Brand brand;
    private final Processor cpu;
    private final Memory ram;
    private final Monitor monitor;
    private final double price;

    public Computer(Brand brand, Processor cpu, Memory ram, Monitor monitor, double price) {
        this.brand = brand; this.cpu = cpu; this.ram = ram; this.monitor = monitor; this.price = price;
    }

    public Brand getBrand() { return brand; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return brand + " | " + cpu + " | " + ram + " | " + monitor + " | price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer c = (Computer) o;
        return Double.compare(c.price, price) == 0 && brand == c.brand && Objects.equals(cpu, c.cpu);
    }
}
