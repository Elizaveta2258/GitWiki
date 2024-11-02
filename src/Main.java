/**
 * Класс Circle представляет круг с заданным радиусом.
 */
class Circle {
    private double radius;

    /**
     * Конструктор класса Circle.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга.
     *
     * @return Площадь круга.
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Вычисляет периметр (длину окружности) круга.
     *
     * @return Периметр круга.
     */
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Возвращает радиус круга.
     *
     * @return Радиус круга.
     */
    public double getRadius() {
        return radius;
    }
}

/**
 * Главный класс с методом main для тестирования класса Circle.
 */
public class Main {
    /**
     * Метод main — точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}

