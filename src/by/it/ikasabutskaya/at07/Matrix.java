package by.it.ikasabutskaya.at07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Matrix extends by.it.ikasabutskaya.at07.Var {

    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    Matrix(String strMatrix) {
        //  {{1.0, 2.0}, {3.0, 4.0}}
        String strMatrixNew = strMatrix.substring(1, strMatrix.length()-1); // {1.0, 2.0}, {3.0, 4.0}
        // int rows = strMatrixNew.split("}, ").length;  // rows = 2
        int rows = strMatrixNew.length() - strMatrixNew.replace("{", "").length();
        int columns = strMatrixNew.split("},")[0].split(",").length;

        this.value = new double[rows][columns];
        String[][] rowsArr = new String[rows][];

        Pattern p1 = Pattern.compile("(\\{)(.+?)(})");
        Matcher m1 = p1.matcher(strMatrixNew);

        int count = 0;
        while (m1.find() && count < rows) {
            rowsArr[count] = m1.group(2).split(",");
            for (int i = 0; i < columns; i++) {
                this.value[count][i] = Double.parseDouble(rowsArr[count][i].trim());
            }
            count++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter1="";
        for (double[] element1 : value) {
            sb.append(delimiter1).append("{");
            delimiter1=", ";
            String delimiter2="";
            for (double element2 : element1) {
                sb.append(delimiter2).append(element2);
                delimiter2=", ";
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }
}
