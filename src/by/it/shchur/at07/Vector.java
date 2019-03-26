package by.it.shchur.at07;

import java.util.Arrays;

public class Vector extends Var {
    double[] value;

    public Vector (double[] value){
        this.value= Arrays.copyOf(value, value.length);
    }
    public Vector (String strVector){
        String[] s= strVector.replace("{","").replace("}","").split(",\\s*");
        value=new double[s.length];
        for (int i = 0; i < s.length; i++) {
            value[i]=Double.parseDouble(s[i]);
        }
        //{1,2,3,4,5,0}
    }
    public Vector (Vector vector){
        this.value= Arrays.copyOf(vector.value, vector.value.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(value);
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            double[] res=Arrays.copyOf(value, value.length);
            for (int i = 0; i < value.length; i++) {
//                res[i]=res[i]+((Scalar) other).value;
            }
        }
        return super.add(other);
    }
}
