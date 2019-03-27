package by.it.romanova.at07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Matrix extends Var{

    private double[][] arr;

    Matrix(double[][] value){
        this.arr = new double[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            this.arr[i] = Arrays.copyOf(value[i],value[i].length);
        }
    }

    Matrix(Matrix matrix){
        this.arr = matrix.arr;
    }

    Matrix(String strMatrix){
        StringBuilder stringBuilder = new StringBuilder(strMatrix);
        Pattern arrayPattern = Pattern.compile("\\{[0-9\\.,]+\\}");
        Pattern commas = Pattern.compile("\\}[,]\\{");
        Matcher rows = arrayPattern.matcher(stringBuilder);
        Matcher count = commas.matcher(stringBuilder);

        int length = 1;
        while (count.find()){
            length++;
        }

        this.arr = new double[length][1];
        int i=0;
        while (rows.find()){
            int j=0;
            String row[] = rows.group().replace("{","").replace("}","").split(",");
            for (String s : row) {
                this.arr[i] = Arrays.copyOf(arr[i],j+1);
                this.arr[i][j] = Double.parseDouble(s);
                j++;
            }
            i++;
        }
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            double[][] array = new double[this.arr.length][this.arr[0].length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Arrays.copyOf(this.arr[i], this.arr[i].length);
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = array[i][j] + ((Scalar) other).getValue();
                }
            }
            return new Matrix(array);
        }
        if (other instanceof Matrix){
            double[][] array = new double[this.arr.length][this.arr[0].length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Arrays.copyOf(this.arr[i], this.arr[i].length);
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = array[i][j] + ((Matrix) other).arr[i][j];
                }
            }
            return new Matrix(array);

        }
        else
            return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        return super.div(other);
    }

    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            result = result.concat(Arrays.toString(arr[i])).replace('[','{').replace(']','}');
            if(i!=(arr.length-1))
                result = result.concat(",");

        }
        result = result.concat("}");
        return result;
    }
}
