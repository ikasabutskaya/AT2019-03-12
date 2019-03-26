package by.it.shchur.at06;

public class Scalar extends Var{
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
}
