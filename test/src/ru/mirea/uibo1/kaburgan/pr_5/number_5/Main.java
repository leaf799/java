package ru.mirea.uibo1.kaburgan.pr_5.number_5;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Исходная точка: " + point);
        point.moveRight();
        point.moveUp();
        System.out.println("После движения: " + point);

        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        System.out.println("Исходный круг: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("После движения: " + circle);
    }
}
