package by.it.agrinkevich.calc.at14;

import by.it.agrinkevich.calc.CalcException;
import by.it.agrinkevich.calc.Var;
import org.junit.Assert;
import org.junit.Test;

public class ScalarCreateTest {

    @Test
    public void checkVarCreate() throws CalcException {
        Var var = Var.createVar("123");
        Assert.assertEquals("123.0",var.toString());
    }
}
