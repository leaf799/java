package ru.mirea.uibo1.kaburgan.pr_4.number_4.other;

public class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" + model + ", " + frequency + "GHz}";
    }
}

