package by.it.vshchur.at10_calc;

public abstract class Var implements Operation {

   static Var createVar(String strVar) throws CalcException {
       strVar=strVar.replace(" ","");
       if (strVar.matches(Patterns.SCALAR))
           return new Scalar(strVar);
       else if (strVar.matches(Patterns.VECTOR))
           return new Vector(strVar);
       else if (strVar.matches(Patterns.MATRIX))
           return new Matrix(strVar);
       else
           throw new CalcException("Неизвестное выражение, невозможно создать "+strVar);
   }


    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("Сложение "+this+" + "+other+" невозможно!");
    }

    @Override
    public Var sub(Var other)  throws CalcException {
        throw new CalcException("Вычитание "+this+" - "+other+" невозможно!");
    }

    @Override
    public Var mul(Var other)  throws CalcException {
        throw new CalcException("Умножение "+this+" * "+other+" невозможно!");
    }

    @Override
    public Var div(Var other)  throws CalcException {
        throw new CalcException("Деление "+this+" + "+other+" невозможно!");
    }

//    @Override
//    public String toString() {
//        return "Это абстрактная переменная";
//    }
}
