package by.it.romanova.at07;

class Scalar extends Var{

    private double value;

    public double getValue() {
        return value;
    }

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

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar o = (Scalar)other;
            double result = this.value + o.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar){
            Scalar o = (Scalar)other;
            double result = this.value - o.value;
            return new Scalar(result);
        }
        else return new Scalar(-1).mul(other).add(this);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar){
            Scalar o = (Scalar)other;
            double result = this.value * o.value;
            return new Scalar(result);
        }
        return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar){
            Scalar o = (Scalar)other;
            double result = this.value / o.value;
            return new Scalar(result);
        }
        return super.div(other);
    }
}
