package by.it.agrinkevich.at07;

public abstract class Var implements Operation{

    @Override
    public Var add(Var other) {
        System.out.println("" + " " + "");
        return null;
    }

    @Override
    public Var sub(Var other) {
        return null;
    }

    @Override
    public Var mul(Var other) {
        return null;
    }

    @Override
    public Var div(Var other) {
        return null;
    }

    @Override
    public String toString() {
        return "Это абстрактная переменная Var";
    }
}
