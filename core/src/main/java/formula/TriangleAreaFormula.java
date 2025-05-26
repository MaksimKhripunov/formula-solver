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
     * @param baseA основание треугольника
     * @param height высота треугольника
     */
    public TriangleAreaFormula(final Double baseA, final Double height) {
        this.a = baseA;
        this.h = height;
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
