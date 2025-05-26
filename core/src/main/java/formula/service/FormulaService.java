/**
 * Сервисные классы, обрабатывающие формулы.
 */
package formula.service;

import formula.Formula;

import java.util.logging.Logger;

/**
 * Сервис для вычисления значений формул с логированием результата.
 */
public class FormulaService {

    /** Логгер. */
    private final Logger logger;

    /**
     * Конструктор сервиса.
     *
     * @param formulaLogger логгер для вывода сообщений
     */
    public FormulaService(final Logger formulaLogger) {
        this.logger = formulaLogger;
    }

    /**
     * Вычисляет значение переданной формулы.
     *
     * @param formula формула для вычисления
     * @return результат вычисления
     */
    public double calculate(Formula formula) {
        double result = formula.solve();
        logger.info("Результат: " + result);
        return result;
    }
}
