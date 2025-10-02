package ru.mirea.uibo1.kaburgan.pr_4.number_1;

public class SeasonTest {
    public static void main(String[] args) {
        Season myFav = Season.SUMMER;
        System.out.println("Моё любимое время года: " + myFav);
        System.out.println("Средняя температура: " + myFav.getAvgTemp());
        System.out.println("Описание: " + myFav.getDescription());

        System.out.println("\nSwitch пример:");
        switch (myFav) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }

        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + " | " + s.getAvgTemp() + "° | " + s.getDescription());
        }
    }
}


