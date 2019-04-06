package by.it.udalyou.at07;

import by.it.tsyhanova.calc.CalcException;
import by.it.udalyou.Calk.CalkException;

public abstract class Var implements Operation {

    @Override
    public Var add(Var other) throws CalkException, CalcException {
        System.out.println("Операция сложения "+this+"+"+other+" не возможна");
        return null;
    }

    @Override
    public Var sub(Var other) throws CalkException, CalcException {
        System.out.println("Операция вычитания "+this+"-"+other+" не возможна");
        return null;
    }

    @Override
    public Var mul(Var other) throws CalkException {
        System.out.println("Операция умножения "+this+"*"+other+" не возможна");
        return null;
    }

    @Override
    public Var div(Var other) throws CalkException {
        System.out.println("Операция деления "+this+"/"+other+" не возможна");
        return null;
    }
    @Override
    public String toString(){return "Это абстрктная переменная";}
}
