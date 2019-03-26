package by.it.tsyhanova.at06;

import java.util.Arrays;

public class Vector extends Var{
    private double[] value;

    public Vector(double[] value) {
        //value получили как ссылку на массив
        //необходимо скопировать данные в полученный массив, предварительно разорвав два полученных массив
        //чтобы не было конфликта, если кто-то изменить value извне, на который раньше ссылался this.value=value;
        this.value = Arrays.copyOf(value,value.length);
    }

    public Vector(String strVector) {
        //{1,2,3,4,5,0} нужно сделать вектор(массив) из строки strVector, убрав скобки и посплитив по запятым
        String[] s = strVector.replace("{", "").replace("}", "").split(",\\s*");
        value= new double[s.length];
        for (int i = 0; i <s.length ; i++) {
            value[i]=Double.parseDouble(s[i]);
        }
    }

    public Vector(Vector vector) {
        //также избегание конфликта value
        this.value = Arrays.copyOf(vector.value,vector.value.length);
    }


    @Override
    public String toString() {
        return Arrays.toString(value).replace('[','{').replace(']','}');
    }
}
