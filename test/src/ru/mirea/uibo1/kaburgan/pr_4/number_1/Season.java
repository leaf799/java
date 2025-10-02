package ru.mirea.uibo1.kaburgan.pr_4.number_1;

public enum Season {
    WINTER(-5),
    SPRING(10),
    SUMMER(25),
    AUTUMN(8);

    private final int avgTemp;

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Тёплое время года";
        } else {
            return "Холодное время года";
        }
    }
}

