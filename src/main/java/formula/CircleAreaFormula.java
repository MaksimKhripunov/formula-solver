package formula;

public class CircleAreaFormula implements Formula {
    private final Double r;

    public CircleAreaFormula(Double r) {
        this.r = r;
    }

    public double solve() {
        return Math.PI * r * r;
    }
}
