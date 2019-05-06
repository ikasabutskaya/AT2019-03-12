package by.it.udalyou.at08;

import by.it.udalyou.Calk.CalkException;

abstract class Var implements Operation {

    static Var createVar(String operand){
        operand=operand.trim().replace("\\s+","");
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if (operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        return null;//когда вставлю вектор и матрицу - убрать

    }

    @Override
    public Var add(Var other)throws CalkException {
        System.out.println("Операция сложения "+this+"+"+other+" не возможна");
        return null;
    }

    @Override
    public Var sub(Var other) throws CalkException {
        System.out.println("Операция вычитания "+this+"-"+other+" не возможна");
        return null;
    }

    @Override
    public Var mul(Var other) throws CalkException {
        System.out.println("Операция умножения "+this+"*"+other+" не возможна");
        return null;
    }

    @Override
    public Var div(Var other)throws CalkException {
        System.out.println("Операция деления "+this+"/"+other+" не возможна");
        return null;
    }
}
