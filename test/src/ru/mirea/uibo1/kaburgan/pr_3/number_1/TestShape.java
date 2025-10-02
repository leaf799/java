package ru.mirea.uibo1.kaburgan.pr_3.number_1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle) s1;
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // ошибка! Нельзя создать абстрактный класс

        Shape s3 = new Rectangle(2.0, 3.0, "BLUE", true);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6, "GREEN", true);
        System.out.println(s4);
        System.out.println(s4.getArea());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());
    }
}
