package by.it.agrinkevich.at04;

class Helper {
    static double findMin(double[] arr) {
        if (0 == arr.length)
            return Double.MIN_VALUE;
        else {
            double min = arr[0];
            for (double element : arr) {
                if (min > element)
                    min = element;
            }
            System.out.println("Минимальное значение: " + min);
            return min;
        }
    }
    static double findMax(double[] arr) {
        if (0 == arr.length)
            return Double.MAX_VALUE;
        else {
            double max = arr[0];
            for (double element : arr) {
                if (max < element)
                    max = element;
            }
            System.out.println("Максимальное значение: " + max);
            return max;
        }
    }

    static void sort(double[] arr){
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end; ++i){
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.print("Отсортированный массив: ");
                for (double element : arr) {
                    System.out.print(element + " ");
                }
                System.out.println();
                break;
            }
            swapped = false;
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }

    static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
        double[] resVector = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0;  j < vector.length; j++)
                resVector[i] = resVector[i] + matrix[i][j] * vector[j];

        return resVector;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double[][] matrixRes = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++)
            for (int j = 0; j < matrixRight[0].length; j++)
                for (int k = 0; k < matrixRight.length; k++)
                    matrixRes[i][j] = matrixRes[i][j] + matrixLeft[i][k] * matrixRight[k][j];

        return matrixRes;
    }
}
