package by.it.tsyhanova.calc.at14;

import by.it.tsyhanova.calc.CalcException;
import by.it.tsyhanova.calc.Parser;
import by.it.tsyhanova.calc.Var;
import org.junit.Test;

public class ScalarExceptionTest {
//тест на обработку ошибок

    @Test(expected = CalcException.class)
    public void checkCalcException() throws Exception{
        Parser parser=new Parser();
        parser.calc("sadasd+asdasdas");
    }

    @Test(expected = CalcException.class)
    public void checkVarCreate() throws Exception{
        Var var= Var.createVar("bla bla bla");
    }
}
