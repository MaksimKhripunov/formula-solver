package formula;

public class RectangleAreaFormula implements Formula {
    private final Double a;
    private final Double b;

    public RectangleAreaFormula(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public double solve() {
        return a * b;
    }
}
