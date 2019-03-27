package by.it.romanova.at07;

import java.util.Arrays;

class Vector extends Var{

    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(String strVector){
        String[] s = strVector.replace("{", "").replace("}", "").split(",\\s*");
        value = new double[s.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(s[i]);
        }

    }

    public Vector(Vector vector) {
        this.value = Arrays.copyOf(vector.value, vector.value.length);
    }

    @Override
    public Var add(Var other) {
        if(other instanceof Scalar){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]+((Scalar)other).getValue();
            }
            return new Vector(result);

        }
        else if (other instanceof Vector){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]+((Vector)other).value[i];
            }
            return new Vector(result);

        }
        else
            return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if(other instanceof Scalar){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]-((Scalar)other).getValue();
            }
            return new Vector(result);
        }
        else if (other instanceof Vector){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]-((Vector)other).value[i];
            }
            return new Vector(result);

        }
        else
            return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if(other instanceof Scalar){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]*((Scalar)other).getValue();
            }
            return new Vector(result);
        }
        else if (other instanceof Vector){
            double[] array = Arrays.copyOf(value, value.length);
            double result = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i]*((Vector)other).value[i];
                result = result +  array[i];
            }
            return new Scalar(result);

        }
        else
            return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        if(other instanceof Scalar){
            double[] result = Arrays.copyOf(value, value.length);
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i]/((Scalar)other).getValue();
            }
            return new Vector(result);
        }
        else
            return super.div(other);
    }

    @Override
    public String toString() {
        return Arrays.toString(value).replace('[','{').replace(']','}');
    }
}
