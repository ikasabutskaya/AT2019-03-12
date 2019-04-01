package by.it.tsyhanova.at08;

public class Patterns {
    static final String SCALAR="-?[0-9]+(\\.?[0-9]+)?";
    static final String VECTOR="\\{((-?[0-9]+(\\.?[0-9]+)?),?)+}";
    static final String MATRIX="\\{((\\{((-?[0-9]+(\\.?[0-9]+)?),?)+}),?)+}";
    // minus must be always the first or the last in regex
    static final String OPERATION="[-+*/]";

}
