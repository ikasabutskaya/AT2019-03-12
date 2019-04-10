package by.it.vshchur.at06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Matrix extends Var {

    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    public Matrix(String strMatrix){
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

        this.value = newRes;
    }






//    Matrix(String strMatrix) {
//        String[] rowsArray = strMatrix.replace("{{", "{").replace("}}", "}").split("\\},\\s");
//        value = new double[rowsArray.length][];
//        for (int i = 0; i < rowsArray.length; i++) {
//            String[] row = rowsArray[i].replace("{", "").replace("}", "").split(",\\s*");
//            value[i] = new double[rowsArray[i].length()];
//            for (int j = 0; j < rowsArray[i].length(); j++) {
//                value[i][j] = Double.parseDouble(row[j]);
//            }
//        }
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int matrixLength = value.length;
        for (int i = 0; i < matrixLength; i++) {
            sb.append(Arrays.toString(value[i]).replace('[', '{').replace(']', '}'));
            if (i != matrixLength - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        StringBuilder sbColumn = new StringBuilder("{");
//        String delimeterColumn = "";
//        for (int i = 0; i < value.length; i++) {
//            StringBuilder sbRow = new StringBuilder("{");
//            String delimeterRow = "";
//            for (int j = 0; j < value[i].length; j++) {
//                sbRow.append(delimeterRow).append(value[i][j]);
//                delimeterRow = ",";
//            }
//            sbRow.append("}");
//            sbColumn.append(delimeterColumn).append(sbRow);
//            delimeterColumn = ",";
//        }
//        sbColumn.append("}");
//        return sbColumn.toString();
//    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("{");
//        String delimeter = "";
//        for (double[] element : value) {
//            sb.append(delimeter).append(Arrays.toString(element));
//            delimeter = ", ";
//        }
//        sb.append("}");
//        return sb.toString();
//    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("{");
//        String delimeter = "";
//        for (double[] element : value) {
//            StringBuilder sbRow = new StringBuilder("{");
//            String delimeterRow = "";
//            for (int i = 0; i < element.length; i++) {
//                sbRow.append(delimeterRow).append(element.toString());
//                delimeterRow = ", ";
//            }
//            sbRow.append("}");
//            sb.append(delimeter).append(element);
//            delimeter = ", ";
//        }
//        sb.append("}");
//        return sb.toString();
//    }

}