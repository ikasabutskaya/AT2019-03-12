package by.it.udalyou.at03;

public class Helper {

    static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static double[] sort(double[] arr) {

    /*    printMas(arr);
*/
        int j=1;

       while (j<arr.length) {
           int last = arr.length - j;
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    double buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
      /*          printMas(arr);
*/
            }
            j++;
        }
        return arr;
    }

 /*   private static void printMas(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    */
 //C.Реализуйте умножение матрицы на вектор, матрицы на матрицу для типа double.
    // Разместите статическиеметоды в классе by.it.familiya.at03.Helper.
    //Сигнатуры: static double[ ] mul(double[ ][ ] matrix, double[ ] vector)
    //static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight)
 static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
     double[]z=new double[matrix.length];
     for (int i=0;i<matrix.length; i++)
         for (int j=0; j<vector.length;j++)
             z[i]=z[i]+matrix[i][j]*vector[j];
         return z;
         }
    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){

    double[][] z= new double[matrixLeft.length][matrixRight[0].length];
     for (int i=0;i<matrixLeft.length; i++)
            for (int j=0; j<matrixRight[0].length;j++)
                for (int k=0;k<matrixRight.length;k++){
    z[i][j]=z[i][j]+matrixLeft[i][k]*matrixRight[k][j];
        System.out.print(z[i][j]);}
        for (int i=0;i<z.length;i++){
            for (int j=0;j<z[0].length;j++)
                System.out.printf("%10.4f",z[i][j]);
            System.out.println();
        }
        System.out.println();
         return z;
}
 }



