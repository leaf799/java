package ru.mirea.uibo1.kaburgan.pr_8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomShapes extends JPanel {

    // ===== Абстрактный класс =====
    abstract class Shape {
        Color color;
        int x, y;

        Shape(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        abstract void draw(Graphics g);
    }

    // ===== Круг =====
    class Circle extends Shape {
        int radius;

        Circle(Color color, int x, int y, int radius) {
            super(color, x, y);
            this.radius = radius;
        }

        @Override
        void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, radius, radius);
        }
    }

    // ===== Прямоугольник =====
    class Rect extends Shape {
        int w, h;

        Rect(Color color, int x, int y, int w, int h) {
            super(color, x, y);
            this.w = w;
            this.h = h;
        }

        @Override
        void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, w, h);
        }
    }

    // ===== Список фигур =====
    ArrayList<Shape> shapes = new ArrayList<>();
    Random rnd = new Random();

    // Формируем 20 случайных фигур
    public RandomShapes() {
        for (int i = 0; i < 20; i++) {
            Color c = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            int x = rnd.nextInt(450);
            int y = rnd.nextInt(450);

            if (rnd.nextBoolean()) {
                shapes.add(new Circle(c, x, y, 20 + rnd.nextInt(80)));
            } else {
                shapes.add(new Rect(c, x, y,
                        20 + rnd.nextInt(100),
                        20 + rnd.nextInt(100)));
            }
        }
    }

    // Рисуем все фигуры
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    // ===== Точка входа =====
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapes panel = new RandomShapes();

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}

