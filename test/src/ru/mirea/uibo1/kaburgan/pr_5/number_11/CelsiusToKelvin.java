package ru.mirea.uibo1.kaburgan.pr_5.number_11;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}
