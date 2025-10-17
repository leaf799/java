package ru.mirea.uibo1.kaburgan.pr_5.number_3;

public class Planet implements Nameable {
    private final String name;
    public Planet(String name) { this.name = name; }
    @Override public String getName() { return name; }
    @Override public String toString() { return "Planet{" + name + "}"; }
}