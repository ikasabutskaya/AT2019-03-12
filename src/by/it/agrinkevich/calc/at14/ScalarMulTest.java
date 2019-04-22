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
public class ScalarMulTest {

    @Parameterized.Parameters
    public static List<String[]> createData() {
        String[][] str = {
                {"8*4", "32.0"},
                {"0*0", "0.0"},
                {"3.4*5.22", "17.748"},
                {"7.43*5", "37,15"},
                {"3.48888*0", "0"}
        };
        return Arrays.asList(str);
    }

    @Parameterized.Parameter(value = 0)
    public String expression;

    @Parameterized.Parameter(value = 1)
    public String result;

    @Test
    public void mul() throws CalcException {
        Parser parser = new Parser();
        Var actual = parser.calc(expression);
        Assert.assertEquals(result, actual.toString());
        System.out.println("passed: " + expression+"="+result);
    }
}

