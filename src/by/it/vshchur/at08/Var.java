package by.it.vshchur.at08;

import java.util.regex.Pattern;

public abstract class Var implements Operation{

//    static Var createVar(String operand){
//        //operand.matches()
//    }
static Var createVar (String operand){
    operand=operand.trim().replace(" ", "");
    if (operand.matches(Patterns.SCALAR))
        return new Scalar((operand));
    return null;
}

    @Override
    public Var add(Var other) {
        System.out.println("сложение "+this+" + "+other+" невозможно!");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("вычитание "+this+" - "+other+" невозможно!");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("умножение "+this+" * "+other+" невозможно!");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("деление "+this+" + "+other+" невозможно!");
        return null;
    }

    @Override
    public String toString() {
        return "Это абстрактная переменная";
    }
}
