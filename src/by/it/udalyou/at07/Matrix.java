package by.it.udalyou.at07;


import by.it.udalyou.Calk.CalkException;
import java.util.Arrays;

public class Matrix extends Var {
    //разработайте для класса Var наследника Matrix с тремя конструкторами:
    //1.Из массива{ { 1.0, 2.0 }, { 3.0, 4.0 } }сигнатура
    // Matrix(double[ ][ ] value)
    //2.Из такой же точно переменнойсигнатура Matrix(Matrix matrix)
    //3.Из строки вида { { 1.0, 2.0 }, { 3.0, 4.0 } }сигнатура
    // Matrix(String strMatrix)

    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    Matrix(String strMatrix) {

        String[] strArray = strMatrix.split("},");

        double[][] arr = new double[strArray[0].split(",").length][strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].replaceAll("[{|}]", "").trim();
            String[] mas = strArray[i].split(",");
            for (int j = 0; j < mas.length; j++) {
                arr[i][j] = Double.parseDouble(mas[j]);
            }
            this.value = arr;
        }
    }
//Переопределите метод String toString()так, чтобы он возвращал строку
    // вида { { 1.0, 2.0 }, { 3.0, 4.0 } }

    public String toString() {

        String s = Arrays.deepToString(value).replace("[", "{").
                replace("]", "}");

        return s.toString();
    }

    public Var add (Var other) throws CalkException{

        if (other instanceof Scalar) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            for (int i = 0; i < z1.length; i++) {
                for (int j = 0; j < value[0].length; j++) {
                    // for (int k=0;k<matrixRight.length;k++){
                    //    z[i][j]=z[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                    z[i][j] = z1[i][j]+(((Scalar) other).value);
                }
            }
            return new Matrix(z);
        }
        if (other instanceof Matrix) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            double[][] z2 = (((Matrix) other).value);
            if (z1.length == z2.length && z1[0].length == z2[0].length) {
                for (int i = 0; i < z1[0].length; i++) {
                    for (int j = 0; j < z1.length; j++) {
                        z[i][j] = z1[i][j] + z2[i][j];
                    }
                }
                return new Matrix(z);
            }

        }
        return super.add(other);
    }
    public Var sub (Var other) throws CalkException{

        if (other instanceof Scalar) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            for (int i = 0; i < z1.length; i++) {
                for (int j = 0; j < value[0].length; j++) {
                    z[i][j] = z1[i][j]-(((Scalar) other).value);
                }
            }
            return new Matrix(z);
        }
        if (other instanceof Matrix) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            double[][] z2 = (((Matrix) other).value);
            if (z1.length == z2.length && z1[0].length == z2[0].length) {
                for (int i = 0; i < z1[0].length; i++) {
                    for (int j = 0; j < z1.length; j++) {
                        z[i][j] = z1[i][j] - z2[i][j];
                    }
                }
                return new Matrix(z);
            }

        }
        return super.sub(other);
    }
    public Var mul (Var other) throws CalkException{

        if (other instanceof Scalar) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            for (int i = 0; i < z1.length; i++) {
                for (int j = 0; j < value[0].length; j++) {
               z[i][j] = z1[i][j]*(((Scalar) other).value);
                }
            }
            return new Matrix(z);
        }
        if (other instanceof Vector){
            //static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
            //     double[]z=new double[matrix.length];
            //     for (int i=0;i<matrix.length; i++)
            //         for (int j=0; j<vector.length;j++)
            //             z[i]=z[i]+matrix[i][j]*vector[j];
            //         return z;
            double[][] matr = this.value;
            double[] z = new double[matr.length];
            double[] vect = ((Vector) other).value;
            for (int i = 0; i < matr.length; i++) {
                for (int j = 0; j < vect.length; j++) {

                    z[i]=z[i]+matr[i][j]*vect[j];
                }
            }
            return new Vector(z);

        }
        if (other instanceof Matrix) {

            double[][] z = new double[this.value[0].length][this.value.length];
            double[][] z1 = this.value;
            double[][] z2 = (((Matrix) other).value);
            if (z1.length == z2.length && z1[0].length == z2[0].length) {
                for (int i = 0; i < z1[0].length; i++) {
                    for (int j = 0; j < z1.length; j++) {
                        for (int k = 0; k < z2.length; k++) {
                            z[i][j] = z[i][j] + z1[i][k] * z2[k][j];
                            // double[][] z= new double[matrixLeft.length][matrixRight[0].length];
                            //     for (int i=0;i<matrixLeft.length; i++)  z1
                            //            for (int j=0; j<matrixRight[0].length;j++)
                            //                for (int k=0;k<matrixRight.length;k++){
                            //    z[i][j]=z[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                            // z[i][j] = z1[i][j] * z2[i][j];
                        }
                    }
                }
                return new Matrix(z);
            }

        }
        return super.mul(other);
    }
}
