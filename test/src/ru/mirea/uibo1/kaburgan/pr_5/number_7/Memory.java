package ru.mirea.uibo1.kaburgan.pr_5.number_7;

public class Memory {
    private final int sizeGB;
    public Memory(int sizeGB) { this.sizeGB = sizeGB; }
    @Override public String toString() { return sizeGB + "GB"; }
}