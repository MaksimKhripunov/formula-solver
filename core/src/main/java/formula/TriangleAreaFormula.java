package formula;

/**
 * Формула вычисления площади треугольника: (1/2) * a * h.
 */
public class TriangleAreaFormula implements Formula {

    private final Double a;
    private final Double h;

    /**
     * Конструктор формулы площади треугольника.
     *
     * @param a основание треугольника
     * @param h высота треугольника
     */
    public TriangleAreaFormula(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    /**
     * Вычисляет площадь треугольника.
     *
     * @return площадь
     */
    @Override
    public double solve() {
        return 0.5 * a * h;
    }
}
