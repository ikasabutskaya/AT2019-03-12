package by.it.lugansky.calc;


abstract class Var implements Operation {

    static Var createVar(String operand) throws  CalcException{
        operand=operand.trim().replace("\\s+", "");
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);

        throw new CalcException("Невозможно создать"+operand);
   }

    @Override
    public Var add(Var other) throws  CalcException{
        throw  new CalcException("Сложение "+this+"+"+other+" невозможно");
    }

    @Override
    public Var sub(Var other) throws  CalcException{
        throw  new CalcException("Вычитание "+this+"+"+other+" невозможно");
    }

    @Override
    public Var mul(Var other) throws  CalcException{
        throw new CalcException("Умножение "+this+"*"+other+" невозможно");
    }

    @Override
    public Var div(Var other) throws CalcException{
        throw new CalcException("Деление "+this+"/"+other+" невозможно");
    }

    @Override
   public String toString() {

       return "Это класс AbstractVar";
   }


}
