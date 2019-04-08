package by.it.stanishevski.at08;

public class Scalar extends Var {

    private double value;

    private Scalar(double value) {this.value = value;}


    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double sum = this.value + ((Scalar) other).value;
            return new Scalar(sum);
        }
        else
            return other.add(this);
    }

    Scalar(String str){this.value=Double.parseDouble(str);}
    Scalar (Scalar scalar) {this.value=scalar.value;}


    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double sub = this.value - ((Scalar) other).value;
            return new Scalar(sub);
        }
        return new Scalar(-1).mul(other).add(this) ;



    }

    @Override
    public Var mul(Var other) {
               if (other instanceof Scalar) {
                double mul = this.value * ((Scalar) other).value;
                return new Scalar(mul);
            }
            else return other.add(this);
        }

    @Override
    public Var div(Var other) {
            if (other instanceof Scalar) {
                double div = this.value / ((Scalar) other).value;
                return new Scalar(div);
            }
            return super.div(other);
    }

    @Override
    public String toString() {return Double.toString(value);}
}
