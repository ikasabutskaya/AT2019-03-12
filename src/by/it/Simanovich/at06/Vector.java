package by.it.Simanovich.at06;

import java.util.Arrays;

public class Vector extends Var {

    private double [] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(String strVector) {
        String [] s = strVector.replace("{","").replace("}","").split(",\\s*");
        value = new double [s.length];
        for (int i = 0; i < s.length ; i++) {
            value [i] = Double.parseDouble(s[i]);

        }
    }

    public Vector(Vector vector) {
        this.value = Arrays.copyOf(vector.value, vector.value.length);
    }
}
