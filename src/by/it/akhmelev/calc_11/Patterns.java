package by.it.akhmelev.calc_11;

public class Patterns {
    static final String SCALAR="-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR="\\{((-?[0-9]+(\\.[0-9]+)?),?)+}";
    static final String MATRIX="\\{(\\{((-?[0-9]+(\\.[0-9]+)?),?)+},?)+}";
    static final String OPERATION="[-+*/=]";

}
