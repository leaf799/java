package ru.mirea.uibo1.kaburgan.pr_9;

public class Main3 {

    public static class C {

        Circle c = new Circle(10);

        public static void main(String[] args) {
            C obj = new C();   // нужно создать объект
            obj.method1();
        }

        public void method1() {
            method2();         // OK
        }

        public static void method2() {
            C temp = new C();
            System.out.println("What is area: " + temp.c.getArea());
        }
    }

    static class Circle {
        double radius;

        Circle(double r) {
            radius = r;
        }

        double getArea() {
            return radius * radius * Math.PI;
        }
    }
}
