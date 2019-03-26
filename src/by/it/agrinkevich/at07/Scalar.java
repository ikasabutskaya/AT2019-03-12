package by.it.agrinkevich.at07;

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
    public Var add(Var other){
        if (other instanceof Scalar){
            Scalar o = (Scalar) other;
            double result = this.value + o.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var sub(Var other){
        if (other instanceof Scalar){
            Scalar o = (Scalar) other;
            double result = this.value - o.value;
            return new Scalar(result);
        }
        Var minus = new Scalar(-1);
        return other.sub(this).mul(minus);
    }

    @Override
    public Var mul(Var other){
        if (other instanceof Scalar){
            Scalar o = (Scalar) other;
            double result = this.value * o.value;
            return new Scalar(result);
        }
        return other.mul(other);
    }

    @Override
    public Var div(Var other){
        if (other instanceof Scalar){
            Scalar o = (Scalar) other;
            double result = this.value / o.value;
            return new Scalar(result);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
