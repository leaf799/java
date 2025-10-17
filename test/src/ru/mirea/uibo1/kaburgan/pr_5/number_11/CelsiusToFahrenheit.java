package ru.mirea.uibo1.kaburgan.pr_5.number_11;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double value) {
        return value * 9.0 / 5.0 + 32.0;
    }
}
