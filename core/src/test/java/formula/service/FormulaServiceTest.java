/**
 * Сервисные классы, обрабатывающие формулы.
 */
package formula.service;

import formula.Formula;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Тесты для класса FormulaService.
 */
class FormulaServiceTest {

    @Test
    void calculate_DelegatesToFormulaAndLogsResult() {
        Formula formulaMock = mock(Formula.class);
        Logger loggerMock = mock(Logger.class);

        when(formulaMock.solve()).thenReturn(42.0);

        FormulaService service = new FormulaService(loggerMock);
        double result = service.calculate(formulaMock);

        assertEquals(42.0, result);
        verify(formulaMock).solve();
        verify(loggerMock).info("Результат: 42.0");
    }
}
