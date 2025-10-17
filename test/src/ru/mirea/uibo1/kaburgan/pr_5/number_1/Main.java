package ru.mirea.uibo1.kaburgan.pr_5.number_1;

// Main.java (тест)
public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println("after move: " + p);
        System.out.println(c);
        c.moveLeft();
        System.out.println("after move: " + c);
    }
}
