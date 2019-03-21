package by.it.romanova.at03;

public class Helper {

    public static double findMin(double[] arr) {

        if(arr.length == 0) {
           return Integer.MIN_VALUE;
        }
        else {
            double min = arr[0];
            for (double element : arr) {
                if(element < min)
                    min = element;
            }

            return min;
        }
    }

    public static double findMax(double[] arr) {
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        else {
            double max = arr[0];
            for (double element : arr) {
                if(element > max)
                    max = element;
            }

            return max;
        }

    }

    public static void sort(double[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    double a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }

        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    /**
     * @author Created by E. Romanova
     * @version v1.0
     * @param matrix матрица которую необходимо умножить на вектор
     * @param vector вектор, на который перемноается матрица
     * @return возвращает матрицу double[]
     */


    public static double[] mul (double[][] matrix, double[] vector){

        if (matrix[0].length!=vector.length) {
            System.out.println("Error: Невозможно перемножить\n Reason: невалидный размер");
            return null;
        }

        double[] resultMatrix = new double[matrix.length];
        double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < vector.length; k++) {
                    sum = sum + matrix[j][k] * vector[k];
                }
                resultMatrix[j]= sum;
                sum = 0;
            }

        for (double element : resultMatrix) {
            System.out.print(element + " ");
        }
        System.out.println();

        return resultMatrix;
    }

    public static double[][] mul (double[][] mat1, double[][] mat2){
        if (mat1[0].length!=mat2.length) {
            System.out.println("Error: Невозможно перемножить\nReason: невалидный размер");
            return null;
        }
        double[][] resultMatrix = new double[mat1.length][mat2[0].length];
        double sum = 0;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat2.length; k++) {
                    sum = sum + mat1[i][k]*mat2[k][j];
                }
                resultMatrix[i][j] = sum;
                sum = 0;
            }

        }

        for (int i = 0; i <resultMatrix.length ; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        return resultMatrix;
    }

}
