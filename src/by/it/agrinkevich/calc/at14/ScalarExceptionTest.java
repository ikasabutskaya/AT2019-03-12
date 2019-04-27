package by.it.agrinkevich.calc.at14;

import by.it.agrinkevich.calc.CalcException;
import by.it.agrinkevich.calc.Parser;
import by.it.agrinkevich.calc.Var;
import org.junit.Test;

public class ScalarExceptionTest {

    @Test(expected = CalcException.class)
    public void checkCalcException() throws CalcException {
        Parser parser = new Parser();
        parser.calc("qwerty+qwerty");
    }

    @Test(expected = CalcException.class)
    public void checkVarCreate() throws CalcException {
        Var var = Var.createVar("some text there");
    }
}
