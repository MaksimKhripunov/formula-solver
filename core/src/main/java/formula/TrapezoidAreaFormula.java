/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

/**
 * Формула вычисления площади трапеции: ((a + b) / 2) * h.
 */
public class TrapezoidAreaFormula implements Formula {

    /** Основание a трапеции. */
    private final Double a;

    /** Основание b трапеции. */
    private final Double b;

    /** Высота трапеции. */
    private final Double h;

    /**
     * Конструктор формулы площади трапеции.
     *
     * @param a основание a
     * @param b основание b
     * @param h высота h
     */
    public TrapezoidAreaFormula(final Double a, final Double b, final Double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    /**
     * Вычисляет площадь трапеции.
     *
     * @return площадь
     * @throws IllegalArgumentException если один из параметров неположительный
     */
    @Override
    public double solve() {
        if (a <= 0 || b <= 0 || h <= 0) {
            throw new IllegalArgumentException(
                    "Все параметры должны быть положительными числами"
            );
        }
        return ((a + b) / 2.0) * h;
    }
}
