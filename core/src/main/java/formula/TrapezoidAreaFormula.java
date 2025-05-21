package formula;

public class TrapezoidAreaFormula implements Formula{
    private final Double a;
    private final Double b;
    private final Double h;

    public TrapezoidAreaFormula(Double a, Double b, Double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double solve() {
        if (a <= 0 || b <= 0 || h <= 0) {
            throw new IllegalArgumentException("Все параметры должны быть положительными числами");
        }
        return ((a + b) / 2.0) * h;
    }
}
