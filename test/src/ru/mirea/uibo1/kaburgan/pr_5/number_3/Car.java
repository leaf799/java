package ru.mirea.uibo1.kaburgan.pr_5.number_3;

public class Car implements Nameable {
    private final String name;
    public Car(String name) { this.name = name; }
    @Override public String getName() { return name; }
    @Override public String toString() { return "Car{" + name + "}"; }
}