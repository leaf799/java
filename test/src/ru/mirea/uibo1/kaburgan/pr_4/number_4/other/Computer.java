package ru.mirea.uibo1.kaburgan.pr_4.number_4.other;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", " + processor +
                ", " + memory +
                ", " + monitor +
                '}';
    }
}


