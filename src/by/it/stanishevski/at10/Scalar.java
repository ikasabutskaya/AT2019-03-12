package by.it.stanishevski.at10;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Scalar extends Var {

    private double value;

     Scalar(double value) {this.value = value;}


    @Override
    public Var add(Var other) throws CalcExeption {
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
    public Var sub(Var other) throws CalcExeption{
        if (other instanceof Scalar) {
            double sub = this.value - ((Scalar) other).value;
            return new Scalar(sub);
        }
        return new Scalar(-1).mul(other).add(this) ;



    }

    @Override
    public Var mul(Var other) throws CalcExeption{
               if (other instanceof Scalar) {

                double mul = this.value * ((Scalar) other).value;
                return new Scalar(mul);
            }
            else return other.add(this);
        }

    @Override
    public Var div(Var other) throws CalcExeption{
        if (((Scalar) other).value== 0)
            throw new CalcExeption("Деление на ноль: ");
            if (other instanceof Scalar) {
                double div = this.value / ((Scalar) other).value;
                return new Scalar(div);
            }
            return super.div(other);
    }

    @Override
    public String toString() {return Double.toString(value);}
}
