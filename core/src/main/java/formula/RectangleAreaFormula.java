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
     * @param sideA длина стороны a
     * @param sideB длина стороны b
     */
    public RectangleAreaFormula(final Double sideA, final Double sideB) {
        this.a = sideA;
        this.b = sideB;
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
