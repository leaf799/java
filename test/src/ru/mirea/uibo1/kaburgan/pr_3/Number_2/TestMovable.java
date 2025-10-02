package ru.mirea.uibo1.kaburgan.pr_3.Number_2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 2);
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(c);
        c.moveDown();
        c.moveLeft();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(0, 0, 4, 4, 1, 1);
        System.out.println(r);
        r.moveUp();
        r.moveRight();
        System.out.println(r);
    }
}


