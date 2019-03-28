package by.it.ikasabutskaya.at06;

import java.util.Arrays;

class Vector extends Var{

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector vector) {
        this.value = vector.value;
    }








    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (int i = 0; i < value.length; i++) {
            double element = value[i];
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

}
