package by.it.udalyou.at07;


import by.it.udalyou.Calk.CalkException;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 23.03.2019.
 */
class Vector extends Var {

    public double[] value;
    public double[]getValue(){
        return value;
    }

    public Vector(double[] val) {//this.value= Arrays.copyOf(value,value.length);
        int k = val.length;
        this.value = new double[k];
        System.arraycopy(val, 0, this.value, 0, k);
    }

    public Vector(Vector vector) {//this.value= Arrays.copyOf(vector.value,vector.value.length);
        int k = vector.value.length;
        this.value = new double[k];
        System.arraycopy(vector.value, 0, this.value, 0, k);
    }

    public Vector(String strVector) {

        //   String[] s=strVector.replace("{","").replace("}","").split(",\\s*");
        //   value=new double[s.length];
        //   for (int i=0;i<s.length;i++){
        //       value[i]=Double.parseDouble(s[i]);

        this.value = new double[3];
        Pattern pat = Pattern.compile("[1-9\\.]+");
        Matcher matcher = pat.matcher(strVector);
        int i = 0;
        while (matcher.find()) {
            this.value[i] = Double.parseDouble(matcher.group());
            i++;
        }
    }
    // ************************
    public String toString() {
        String s = "{";

        for (int i = 0; i < this.value.length - 1; i++) {
            s = s + value[i] + ", ";

        }
        s = s + this.value[this.value.length - 1] + "}";

        return s;
        // strVector.replase("{","").replase("}","").split(",\\s*");
    }

    @Override
    public Var add(Var other) throws CalkException  {
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Scalar) other).value;
            }
            return new Vector(res);
        } else if (other instanceof Vector) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Vector) other).value[i];
            }
            return new Vector(res);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) throws CalkException {
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] - ((Scalar) other).value;
            }
            return new Vector(res);
        } else if (other instanceof Vector) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] - ((Vector) other).value[i];
            }
            return new Vector(res);
        }
        return super.sub(other);
    }
    @Override
    public Var mul(Var other) throws CalkException {
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] * ((Scalar) other).value;
            }
            return new Vector(res);
        } else if (other instanceof Vector) {
            double res =0;
            for (int i = 0; i < this.value.length; i++) {
                res+= this.value[i] * ((Vector) other).value[i];
            }
            return new Scalar(res);
        }
        return super.mul(other);
    }
    @Override
    public Var div(Var other) throws CalkException {
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] / ((Scalar) other).value;
            }
            return new Vector(res);
        } else
            return super.div(other);
    }
}
