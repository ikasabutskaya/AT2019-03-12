package by.it.shchur.at07;

public class Scalar extends Var {
 //   @Override
  //  public String toString() {
  //      return "Это Scalar{}";

    private double value;

    public Scalar(double value){
        this.value=value;
    }

    public Scalar(String strScalar){
        value=Double.parseDouble(strScalar);
    }
    public Scalar(Scalar scalar){
        this.value=scalar.value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar o=(Scalar) other;
            return new Scalar (this.value+((Scalar)other).value);
        }
        return super.add(this);
    }
    public Var sub(Var other) {
        if (other instanceof Scalar){
            Scalar o=(Scalar) other;
            return new Scalar (this.value-((Scalar)other).value);
        }
        {
            Var minus=new Scalar(-1);
            return super.sub(this).mul(minus);
        }
    }
    public Var mul(Var other) {
        if (other instanceof Scalar){
            Scalar o=(Scalar) other;
            return new Scalar (this.value*((Scalar)other).value);
        }
        return super.add(other);
    }
    public Var div(Var other) {
        if (other instanceof Scalar){
            Scalar o=(Scalar) other;
            return new Scalar (this.value / ((Scalar)other).value);
        }
        return super.add(other);
    }
}
