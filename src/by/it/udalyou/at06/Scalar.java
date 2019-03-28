package by.it.udalyou.at06;

/**
 * Created by user on 23.03.2019.
 */
public class Scalar extends Var {
    public double value;
    Scalar (double value){
        this.value=value;

    }


         Scalar (String strScalar){
           this.value=Double.parseDouble(strScalar);

        }
        Scalar (Scalar scalar){
            this.value=scalar.value;

        }
        public String toString(){
            return Double.toString(value);
        }
    }

