package by.it.medvedeva.at13_calc;

public class Patterns {
    static final String OPERATION = "[-+/*]";
    static final String SCALAR = "-?[0-9]+\\.?[0-9]*";
    static final String VECTOR = "[{]{1}[-0-9,\\.]+[}]{1}";
    static final String MATRIX = "[{]{2}[-0-9,\\\\.{}]+[}]{2}";

}
