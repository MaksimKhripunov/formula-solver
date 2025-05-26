/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

/**
 * Формула вычисления площади круга по радиусу.
 */
public class CircleAreaFormula implements Formula {

    /** Радиус круга. */
    private final Double r;

    /**
     * Конструктор формулы круга.
     *
     * @param radius радиус круга
     */
    public CircleAreaFormula(final Double radius) {
        this.r = radius;
    }

    /**
     * Вычисляет площадь круга.
     *
     * @return площадь круга
     */
    @Override
    public double solve() {
        return Math.PI * r * r;
    }
}
