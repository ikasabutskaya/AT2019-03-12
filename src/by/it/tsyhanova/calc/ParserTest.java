package by.it.tsyhanova.calc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    //Для каждого отдельного случая суммирования, например, обычное сложение, сложение нулей, сложение более двух слагаемых
    //нужно иметь параметризированные тесты, чтобы иметь возможность поймать соответствующую ошибку
    //Параметризированный тест описывает множество случаем одного вида
    @Test
    public void calcScalarAddTest() throws CalcException {
        Parser p=new Parser();
        Var actual = p.calc("2+2");
        double actualValue=Double.parseDouble(actual.toString());
        double expectedValue=4.0;
        assertEquals("Сложение работает неверно!",expectedValue,actualValue,1e-10);
    }
    //Assert.assertTrue - основной общий метод без конкретики по поводу ошибки.
    // Лучше использовать более специализированные методы... см. Презентацию АТ14
    //@Ignore аннотация, которая нужна для временного отключения теста
    @Test
    public void calcScalarSubTest() throws CalcException {
        Parser p=new Parser();
        Var actual = p.calc("4-2");
        double actualValue=Double.parseDouble(actual.toString());
        double expectedValue=2.0;
        assertEquals("Вычитание работает неверно!",expectedValue,actualValue,1e-10);
    }

    @Test
    public void calcScalarMultTest() throws CalcException {
        Parser p=new Parser();
        Var actual = p.calc("4*2");
        double actualValue=Double.parseDouble(actual.toString());
        double expectedValue=8.0;
        assertEquals("Умножение работает неверно!",expectedValue,actualValue,1e-10);
    }

    @Test
    public void calcScalarDivTest() throws CalcException {
        Parser p=new Parser();
        Var actual = p.calc("4/2");
        double actualValue=Double.parseDouble(actual.toString());
        double expectedValue=2.0;
        assertEquals("Деление работает неверно!",expectedValue,actualValue,1e-10);
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