package by.it.tsyhanova.at08;

public abstract class Var implements Operation{

    static Var createVar(String strVar) {
        strVar.replace(" ", "");
        if (strVar.matches(Patterns.SCALAR)) {
            return new Scalar(strVar);
        } else if (strVar.matches(Patterns.VECTOR)) {
            return new Vector(strVar);
        } else if (strVar.matches(Patterns.MATRIX)) {
            return new Matrix(strVar);
        } else {
            //TODO create error
            return null;
        }
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
