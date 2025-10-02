package ru.mirea.uibo1.kaburgan.pr_4.number_4.other;

public class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory{" + size + "GB}";
    }
}

