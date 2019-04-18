package by.it.agrinkevich.calc.at14;

import by.it.agrinkevich.calc.CalcException;
import by.it.agrinkevich.calc.Parser;
import by.it.agrinkevich.calc.Var;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(value = Parameterized.class)
public class ScalarSubTest {

    @Parameterized.Parameters
    public static List<String[]> createData(){
        String[][] str = {
                {"8-3", "5.0"},
                {"0-0", "0.0"},
                {"7.54-4.222", "3.318"},
                {"67.88-5", "62.88"},
                {"56-23.5", "32.5"},
        };
        return Arrays.asList(str);
    }

    @Parameterized.Parameter(value = 0)
    public String expression;

    @Parameterized.Parameter(value = 1)
    public String result;

    @Test
    public void sub() throws CalcException {
        Parser parser = new Parser();
        Var actual = parser.calc(expression);
        Assert.assertEquals(result,actual.toString());
        System.out.println("passed: "+expression+"="+result);
    }
}
