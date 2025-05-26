/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

/**
 * Формула вычисления площади треугольника: (1/2) * a * h.
 */
public class TriangleAreaFormula implements Formula {

    /** Коэффициент. */
    private static final double HALF = 0.5;

    /** Основание треугольника. */
    private final Double a;

    /** Высота треугольника. */
    private final Double h;

    /**
     * Конструктор формулы площади треугольника.
     *
     * @param a основание треугольника
     * @param h высота треугольника
     */
    public TriangleAreaFormula(final Double a, final Double h) {
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
        return HALF * a * h;
    }
}
