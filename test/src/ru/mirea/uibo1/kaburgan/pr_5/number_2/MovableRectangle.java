package ru.mirea.uibo1.kaburgan.pr_5.number_2;

import ru.mirea.uibo1.kaburgan.pr_5.number_1.MovablePoint;
import ru.mirea.uibo1.kaburgan.pr_5.number_1.Movable;


public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        if (!sameSpeed()) {
            throw new IllegalArgumentException("Points must have same speed");
        }
    }

    public boolean sameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }

    @Override
    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }

    @Override
    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }

    @Override
    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }

    // Main
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint(0, 0, 1, 1);
        MovablePoint b = new MovablePoint(4, 3, 1, 1);
        MovableRectangle rect = new MovableRectangle(a, b);
        System.out.println(rect);
        rect.moveRight();
        rect.moveDown();
        System.out.println("after move: " + rect);
    }
}