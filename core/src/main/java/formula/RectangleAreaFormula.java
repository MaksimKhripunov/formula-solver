package formula;

/**
 * Формула вычисления площади прямоугольника: a * b.
 */
public class RectangleAreaFormula implements Formula {

    private final Double a;
    private final Double b;

    /**
     * Конструктор формулы площади прямоугольника.
     *
     * @param a длина стороны a
     * @param b длина стороны b
     */
    public RectangleAreaFormula(Double a, Double b) {
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
