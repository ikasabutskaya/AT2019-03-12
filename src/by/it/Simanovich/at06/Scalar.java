package by.it.Simanovich.at06;

public class Scalar extends Var {

    private double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String strScalar) {
        value = Double.parseDouble(strScalar);
    }

    public Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}


