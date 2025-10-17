package ru.mirea.uibo1.kaburgan.pr_5.number_8;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double celsius) { return celsius * 9.0/5.0 + 32.0; }
}
