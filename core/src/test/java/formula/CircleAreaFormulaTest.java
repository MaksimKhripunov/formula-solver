/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для класса CircleAreaFormula.
 */
public class CircleAreaFormulaTest {

    @Test
    void solve_ValidInput_ReturnsCorrectArea() {
        CircleAreaFormula formula = new CircleAreaFormula(5d);
        double area = formula.solve();
        assertEquals(78.5398, area, 0.0001);
    }
}
