package by.it.romanova.at06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var{

    double[][] arr;

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
