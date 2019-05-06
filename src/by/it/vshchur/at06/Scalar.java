package by.it.vshchur.at06;

class Scalar extends Var {
    //   @Override
    //  public String toString() {
    //      return "Это Scalar{}";
    private double value;

    @Override
    public String toString() {
        return Double.toString(value);
    }

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String str) {
        this.value = Double.parseDouble(str);
    }

    Scalar(Scalar scalar) {
        this.value = scalar.value;
    }
}
