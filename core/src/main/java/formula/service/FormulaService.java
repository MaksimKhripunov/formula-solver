package formula.service;

import formula.Formula;

import java.util.logging.Logger;

public class FormulaService {
    private final Logger logger;

    public FormulaService(Logger logger) {
        this.logger = logger;
    }

    public double calculate(Formula formula) {
        double result = formula.solve();
        logger.info("Результат: " + result);
        return result;
    }
}
