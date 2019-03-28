package by.it.vshchur.at06;

import java.util.Arrays;

class Vector extends AbstractVar {

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimeter = "";
        for (double element : value) {
            sb.append(delimeter).append(element);
            delimeter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    Vector(String strVector) {
        String[] s = strVector.replace("{", "").replace("}", "").split(",\\s*");
        value = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            value[i] = Double.parseDouble(s[i]);
        }
        //{1,2,3,4,5,0}
    }

//    public Vector(Double[] arrVector) {
//        String[] s = array.replace("{", "").replace("}", "").split(",\\s*");
//        value = new double[s.length];
//        for (int i = 0; i < s.length; i++) {
//            value[i] = Double.parseDouble(s[i]);
//        }
//        //{1,2,3,4,5,0}
//    }

    Vector(Vector vector) {
        this.value = Arrays.copyOf(vector.value, vector.value.length);
    }
}
