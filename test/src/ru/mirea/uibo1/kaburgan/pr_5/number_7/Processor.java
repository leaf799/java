package ru.mirea.uibo1.kaburgan.pr_5.number_7;

public class Processor {
    private final String model;
    private final double frequencyGHz;
    public Processor(String model, double frequencyGHz) { this.model = model; this.frequencyGHz = frequencyGHz; }
    @Override public String toString() { return model + " " + frequencyGHz + "GHz"; }
}
