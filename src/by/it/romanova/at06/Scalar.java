package by.it.romanova.at06;

class Scalar extends Var{

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String strScalar) {
        value = Double.parseDouble(strScalar);
    }

    Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public String toString() {
        //return "Это класс scalar";
        return Double.toString(value);
    }
}
