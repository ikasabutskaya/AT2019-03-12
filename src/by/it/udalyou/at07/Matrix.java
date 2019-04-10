package by.it.udalyou.at07;

import by.it.udalyou.at06.Var;

import java.util.Arrays;

class Matrix extends Var{
    //разработайте для класса Var наследника Matrix с тремя конструкторами:
    //1.Из массива{ { 1.0, 2.0 }, { 3.0, 4.0 } }сигнатура
    // Matrix(double[ ][ ] value)
    //2.Из такой же точно переменнойсигнатура Matrix(Matrix matrix)
    //3.Из строки вида { { 1.0, 2.0 }, { 3.0, 4.0 } }сигнатура
    // Matrix(String strMatrix)

    private double[][]value;
    Matrix(double[ ][ ] value) {this.value=value;}
    Matrix(Matrix matrix){this.value=matrix.value;}
    Matrix(String strMatrix){

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

    public Var add(by.it.udalyou.at07.Var other) {



        return null;
    }
}

