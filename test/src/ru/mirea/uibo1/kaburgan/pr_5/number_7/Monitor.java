package ru.mirea.uibo1.kaburgan.pr_5.number_7;

public class Monitor {
    private final double diagonalInch;
    public Monitor(double diagonalInch) { this.diagonalInch = diagonalInch; }
    @Override public String toString() { return diagonalInch + "''"; }
}