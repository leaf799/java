package ru.mirea.uibo1.kaburgan.pr_9;

public class Main5 {

    public static void main(String[] args) {

        Circle[] array = {
                new Circle(2),
                new Circle(5),
                new Circle(3),
                new Circle(7),
                new Circle(1)
        };

        Circle max = array[0];

        for (Circle c : array) {
            if (c.getArea() > max.getArea()) {
                max = c;
            }
        }

        System.out.println("Круг с максимальной площадью:");
        System.out.println("Радиус: " + max.radius);
        System.out.println("Площадь: " + max.getArea());
    }
}

class Circle {
    double radius;

    Circle(double r) { radius = r; }

    double getArea() { return radius * radius * Math.PI; }
}

