package by.it.agrinkevich.at06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var {
    private double[][] value;

    public Matrix(double[ ][ ] base){
        this.value = new double[base.length][base[0].length];
        for (int i = 0; i < base.length; i++) {
            this.value[i] = Arrays.copyOf(base[i], base[i].length);
        }
    }

    public Matrix(Matrix matrix) {
        this(matrix.value);
    }

    public Matrix(String strMatrix){
        this.value = getDoublesMass(strMatrix);
    }

    private double[][] getDoublesMass(String strMatrix) {
        String nextString = strMatrix.substring(1, strMatrix.length() - 1);
        Pattern pattern = Pattern.compile("(\\{)(.+?)(})");
        Matcher matcher = pattern.matcher(nextString);
        int count = nextString.length() - nextString.replaceAll("\\{", "").length();
        double[][] newRes = new double[count][];
        int i = 1;
        while (matcher.find() && i <= count) {
            String str = matcher.group(2);
            String[] s1 = str.split(",");
            double[] d1 = new double[s1.length];
            for (int j = 0; j < s1.length; j++) {
                d1[j] = Double.parseDouble(s1[j]);
            }
            newRes[i - 1] = d1;
            i++;
        }
        return newRes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int valueLength = value.length;
        for (int i = 0; i < valueLength; i++) {
            sb.append(Arrays.toString(value[i]).replace('[','{').replace(']', '}'));
            if (i != valueLength - 1){
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
