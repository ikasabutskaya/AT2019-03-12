package by.it.akhmelev.at07;

public abstract class Var implements Operation{

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
