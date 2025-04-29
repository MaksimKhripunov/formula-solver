package formula;

/**
 * ЗАДАЧА: Программа позволяет вычислять значения математических формул.
 * Например: Площадь треугольника по формуле: (1/2) * a * h
 */
public class Main {
    public static void main(String[] args) {
        Formula triangleArea = new TriangleAreaFormula(10d, 5d);
        Formula circleArea = new CircleAreaFormula(7d);

        System.out.println("Площадь треугольника (a=10, h=5): " + triangleArea.solve());
        System.out.println("Площадь круга (r=7): " + circleArea.solve());
    }
}
