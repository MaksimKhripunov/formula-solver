/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

/**
 * Формула вычисления площади прямоугольника: a * b.
 */
public class RectangleAreaFormula implements Formula {

    /** Сторона a прямоугольника. */
    private final Double a;

    /** Сторона b прямоугольника. */
    private final Double b;

    /**
     * Конструктор формулы площади прямоугольника.
     *
     * @param a длина стороны a
     * @param b длина стороны b
     */
    public RectangleAreaFormula(final Double a, final Double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return площадь
     */
    @Override
    public double solve() {
        return a * b;
    }
}
