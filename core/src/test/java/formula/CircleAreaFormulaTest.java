package formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaFormulaTest {

    @Test
    void solve_ValidInput_ReturnsCorrectArea() {
        CircleAreaFormula trapezoid = new CircleAreaFormula(5d);
        double area = trapezoid.solve();
        assertEquals(78.5398, area, 0.0001);
    }

}
