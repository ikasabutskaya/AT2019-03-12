package by.it.tsyhanova.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void calcScalarAddTest() throws CalcException {
        Parser p=new Parser();
        Var actual = p.calc("2+2");
        double actualValue=Double.parseDouble(actual.toString());
        double expectedValue=4.0;
        assertEquals("Сложение работает неверно!",expectedValue,actualValue,1e-10);
    }

    @Test
    public void calcInstanceOfScalarTest() throws CalcException {
        //fail();
        Parser p=new Parser();
        Var actual = p.calc("2+2");
        if(!(actual instanceof Scalar)){
            fail("Результат не является скаляром!");
        }
    }
}