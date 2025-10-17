package ru.mirea.uibo1.kaburgan.pr_5.number_8;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double celsius) { return celsius + 273.15; }
}
