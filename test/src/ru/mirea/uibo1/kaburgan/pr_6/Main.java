package ru.mirea.uibo1.kaburgan.pr_6;

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест Movable / MovablePoint / MovableRectangle ===");
        MovablePoint p1 = new MovablePoint(0, 0, 2, 3); // x, y, xSpeed, ySpeed
        MovablePoint p2 = new MovablePoint(5, 4, 2, 3);
        MovableRectangle rect = new MovableRectangle(p1, p2);
        System.out.println("Изначальный прямоугольник: " + rect);
        System.out.println("SpeedTest: " + rect.speedTest());
        rect.moveRight();
        rect.moveDown();
        System.out.println("После moveRight() и moveDown(): " + rect);
        System.out.println();

        System.out.println("=== Тест MathCalculable / MathFunc ===");
        MathCalculable mf = new MathFunc();
        double r = 3.5;
        System.out.printf("Длина окружности радиуса %.2f = %.4f%n", r, mf.circumference(r));
        System.out.printf("2^5 = %.0f%n", mf.pow(2, 5));
        System.out.printf("|3 + 4i| = %.4f%n", mf.complexAbs(3, 4));
        System.out.println();

        System.out.println("=== Тест StringProcessor / ProcessStrings ===");
        StringProcessor sp = new ProcessStrings();
        String s = "abcdefg";
        System.out.println("Исходная строка: " + s);
        System.out.println("Длина: " + sp.countChars(s));
        System.out.println("Нечетные позиции (1,3,5...): " + sp.oddChars(s));
        System.out.println("Инвертированная: " + sp.reverse(s));
        System.out.println();

        System.out.println("=== Тест Printable / Book / Magazine и статических методов ===");
        Printable[] items = new Printable[] {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Magazine("Хакер"),
                new Book("Отцы и дети", "И. Тургенев", 1862),
                new Magazine("Компьютерра")
        };

        System.out.println("Все printable объекты:");
        for (Printable p : items) p.print();

        System.out.println("\nТолько книги (Book.printBooks):");
        Book.printBooks(items);

        System.out.println("\nТолько журналы (Magazine.printMagazines):");
        Magazine.printMagazines(items);

        System.out.println("\n=== Конец тестов ===");
    }
}

/* ---------------------- Интерфейсы ---------------------- */

interface Printable {
    void print();
}

/**
 * Интерфейс для движения: вверх/вниз/влево/вправо
 */
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

/**
 * Интерфейс математических операций
 */
interface MathCalculable {
    // константа PI
    double PI = Math.PI;

    double pow(double a, double b);
    double complexAbs(double real, double imag);

    // Дополнительно: можно добавить метод для длины окружности:
    default double circumference(double radius) {
        return 2 * PI * radius;
    }
}

/**
 * Интерфейс для работы со строками
 */
interface StringProcessor {
    int countChars(String s);
    String oddChars(String s);   // символы на нечётных позициях: 1,3,5... (1-based)
    String reverse(String s);
}

/* ---------------------- Классы для печати ---------------------- */

class Book implements Printable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга: '%s' (автор: %s, %d)%n", title, author, year);
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', year=%d}", title, author, year);
    }

    // Задание 8: статический метод printBooks
    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}

class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал: '%s'%n", name);
    }

    @Override
    public String toString() {
        return String.format("Magazine{name='%s'}", name);
    }

    // Задание 7: статический метод printMagazines
    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}

/* ---------------------- MovablePoint и MovableRectangle ---------------------- */

/**
 * Точка, которая может двигаться.
 * x, y — координаты (double для гибкости)
 * xSpeed, ySpeed — скорость по осям
 *
 * Замечание по направлениям:
 * - moveUp() уменьшает y на ySpeed (как в классических декартовых координатах вверх — y↑,
 *   но для простоты выбрал moveUp как y -= ySpeed — это можно поменять по требованию)
 */
class MovablePoint implements Movable {
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // геттеры и сеттеры
    public double getX() { return x; }
    public double getY() { return y; }
    public double getXSpeed() { return xSpeed; }
    public double getYSpeed() { return ySpeed; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXSpeed(double xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(double ySpeed) { this.ySpeed = ySpeed; }

    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint{x=%.2f, y=%.2f, xSpeed=%.2f, ySpeed=%.2f}", x, y, xSpeed, ySpeed);
    }
}

/**
 * Прямоугольник, представленный двумя движущимися точками:
 * topLeft и bottomRight (их можно менять местами в зависимости от координат).
 */
class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MovablePoint getTopLeft() { return topLeft; }
    public MovablePoint getBottomRight() { return bottomRight; }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    /**
     * Проверяет, одинаковы ли скорости у topLeft и bottomRight (по x и по y)
     */
    public boolean speedTest() {
        return doubleEquals(topLeft.getXSpeed(), bottomRight.getXSpeed())
                && doubleEquals(topLeft.getYSpeed(), bottomRight.getYSpeed());
    }

    // вспомогательный метод сравнения double с допуском
    private boolean doubleEquals(double a, double b) {
        final double EPS = 1e-9;
        return Math.abs(a - b) < EPS;
    }

    @Override
    public String toString() {
        return String.format("MovableRectangle{topLeft=%s, bottomRight=%s}", topLeft, bottomRight);
    }
}

/* ---------------------- MathFunc ---------------------- */

class MathFunc implements MathCalculable {

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double complexAbs(double real, double imag) {
        return Math.hypot(real, imag); // sqrt(real^2 + imag^2)
    }

    // Можно переопределить default-метод circumference при желании, но не обязательно.
    // Для демонстрации используем default из интерфейса:
    @Override
    public String toString() {
        return "MathFunc{}";
    }
}

/* ---------------------- ProcessStrings ---------------------- */

class ProcessStrings implements StringProcessor {

    @Override
    public int countChars(String s) {
        if (s == null) return 0;
        return s.length();
    }

    @Override
    public String oddChars(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        // Пользовательская постановка: позиции 1,3,5... считаем 1-based.
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2) == 0) { // i=0 -> позиция 1 -> нечётная
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    @Override
    public String reverse(String s) {
        if (s == null) return "";
        return new StringBuilder(s).reverse().toString();
    }
}
