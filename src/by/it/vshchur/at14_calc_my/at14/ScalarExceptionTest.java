package by.it.vshchur.at14_calc_my.at14;

import by.it.vshchur.at14_calc_my.CalcException;
import by.it.vshchur.at14_calc_my.Parser;
import by.it.vshchur.at14_calc_my.Var;
import org.junit.Test;

public class ScalarExceptionTest {

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
