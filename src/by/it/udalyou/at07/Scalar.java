package by.it.udalyou.at07;

import by.it.udalyou.Calk.CalkException;

public class Scalar extends Var{
    Scalar(String str) {
        this.value = Double.parseDouble(str);
    }

    Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

   double value;
   //Scalar(
   public Scalar(double value) {this.value=value;  }
   // public Scalar(String strScalar){
     //  value=Double.parseDouble(strScalar);
    //}


    @Override
    public Var add(Var other) throws CalkException {
        if (other instanceof Scalar){
            double sum=this.value+((Scalar) other).value;
            return new Scalar(sum);
        }
        else
            return other.add(this);
    }

    @Override
    public Var sub(Var other) throws CalkException{
        if (other instanceof Scalar){
            double sub=this.value-((Scalar) other).value;
            return new Scalar(sub);
        }
        else
            return new Scalar(-1).mul(other).add(this);
    }

    @Override
    public Var mul(Var other) throws CalkException {
        if (other instanceof Scalar){
            double mul=this.value*((Scalar) other).value;
            return new Scalar(mul);
        }
        else
            return other.mul(this);
    }

    @Override
    public Var div(Var other) throws CalkException {
        if (other instanceof Scalar){
            double div=this.value/((Scalar) other).value;
            return new Scalar(div);
        }
        else
            return super.div(other);
    }





    @Override
   public String toString (){
       return String.valueOf(value);
    }



}
