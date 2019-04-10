package by.it.romanova.calc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void calcSumScalar() throws CalcException {
        Parser parser = new Parser();
        String expression = "A = 4.6+8.9", control = "13.5";

        Assert.assertEquals(parser.calc(expression).toString(),control);
    }

    @Test
    public void calcSubScalar() throws CalcException {
        Parser parser = new Parser();
        String expression = "A = 12.6-17.0", control = "-4.4";

        Assert.assertEquals(parser.calc(expression).toString(),control);
    }

    @Test
    public void calcMulScalar() throws CalcException {
        Parser parser = new Parser();
        String expression = "A = 88.3*6.3", control = "556.29";

        Assert.assertEquals(parser.calc(expression).toString(),control);
    }

    @Test
    public void calcDivScalar() throws CalcException {
        Parser parser = new Parser();
        String expression = "A = 26.8/-2", control = "-13.4";

        Assert.assertEquals(parser.calc(expression).toString(),control);
    }


}