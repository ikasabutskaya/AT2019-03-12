package by.it.agrinkevich.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void calcScalarAddTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("2+2");

        double actualValue = Double.parseDouble(actual.toString());
        double expectedValue=4.0;
        assertEquals("Сложение работает неверно", expectedValue, actualValue, 1e-10);

    }
    @Test
    public void calcScalarSubTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("40-32");

        double actualValue = Double.parseDouble(actual.toString());
        double expectedValue=8;
        assertEquals("Вычитание работает неверно", expectedValue, actualValue, 1e-10);

    }
    @Test
    public void calcScalarMulTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("5*10");

        double actualValue = Double.parseDouble(actual.toString());
        double expectedValue=50;
        assertEquals("Умножение работает неверно", expectedValue, actualValue, 1e-10);

    }
    @Test
    public void calcScalarDivTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("56/8");

        double actualValue = Double.parseDouble(actual.toString());
        double expectedValue=7;
        assertEquals("Деление работает неверно", expectedValue, actualValue, 1e-10);

    }
    @Test
    public void calcVectorAddAScalarTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{1, 2, 3} + 4");

        String actualValue = actual.toString();
        String expectedValue = "{5.0, 6.0, 7.0}";

        assertEquals("Сложение работает неверно", expectedValue, actualValue);

    }
    @Test
    public void calcVectorAddVectorTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{1, 2, 3} + {4, 5, 6}");

        String actualValue = actual.toString();
        String expectedValue = "{5.0, 7.0, 9.0}";

        assertEquals("Сложение работает неверно", expectedValue, actualValue);

    }
    @Test
    public void calcVectorSubScalarTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{5, 6, 7} - 2");

        String actualValue = actual.toString();
        String expectedValue = "{3.0, 4.0, 5.0}";

        assertEquals("Вычитание работает неверно", expectedValue, actualValue);
    }
    @Test
    public void calcVectorSubVectorTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{5, 6, 7} - {1, 2, 3}");

        String actualValue = actual.toString();
        String expectedValue = "{4.0, 4.0, 4.0}";

        assertEquals("Вычитание работает неверно", expectedValue, actualValue);
    }
    @Test
    public void calcVectorMulScalarTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{1, 2, 3} * 3");

        String actualValue = actual.toString();
        String expectedValue = "{3.0, 6.0, 9.0}";

        assertEquals("Умножение работает неверно", expectedValue, actualValue);
    }
/*    @Test
    public void calcVectorMulVectorTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("{1, 2, 3} * {2, 3, 4}");

        String actualValue = actual.toString();
        String expectedValue = "{3.0, 6.0, 9.0}";

        assertEquals("Умножение работает неверно", expectedValue, actualValue);
    }*/



    @Test
    public void calcInstanceScalarTest() throws Exception {
        Parser p = new Parser();
        Var actual = p.calc("2+3");
        //String actualString = actual.toString().intern();
        //String expectedString = "4.0";
        if(!(actual instanceof Scalar)){
            fail("eeeee");
        }
    }
}