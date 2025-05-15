package formula;

public class TriangleAreaFormula implements Formula {
    private final Double a;
    private final Double h;

    public TriangleAreaFormula(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    public double solve() {
        return 0.5 * a * h;
    }
}
