package formula;

/**
 * Формула вычисления площади круга по радиусу.
 */
public class CircleAreaFormula implements Formula {

    private final Double r;

    /**
     * Конструктор формулы круга.
     *
     * @param r радиус круга
     */
    public CircleAreaFormula(Double r) {
        this.r = r;
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
