/**
 * Формулы для расчёта площадей различных фигур.
 */
package formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Тесты для класса TrapezoidAreaFormula.
 */
public class TrapezoidAreaFormulaTest {

    @Test
    void solve_ValidInput_ReturnsCorrectArea() {
        TrapezoidAreaFormula trapezoid = new TrapezoidAreaFormula(5d, 7d, 4d);
        double area = trapezoid.solve();
        assertEquals(24.0, area, 0.0001);
    }

    @Test
    void solve_InvalidInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new TrapezoidAreaFormula(-1d, 7d, 4d).solve());
        assertThrows(IllegalArgumentException.class,
                () -> new TrapezoidAreaFormula(5d, 0d, 4d).solve());
        assertThrows(IllegalArgumentException.class,
                () -> new TrapezoidAreaFormula(5d, 7d, -2d).solve());
    }

    @Test
    void solve_Formula_Mocking() {
        Formula mock = mock(Formula.class);
        when(mock.solve()).thenReturn(42.0);

        assertEquals(42.0, mock.solve());
        verify(mock).solve();
    }
}
