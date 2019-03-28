package by.it.lugansky.at03;

import java.util.Arrays;

public class Helper {
    static double findMin(double[] arr) {
        sort(arr);

        return arr[0];

    }

    static double findMax(double[ ] arr){
        sort(arr);


        return arr[arr.length-1];

    }

    static void sort(double[ ] arr){
        Arrays.sort(arr);


    }


    static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
        double[] z=new double[matrix.length];
        for (int i = 0; i <matrix.length ; i++)
            for (int j = 0; j < vector.length; j++)
                z[i] = z[i] + matrix[i][j] * vector[j];
        return z;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double [][] z=new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i< matrixLeft.length; i++)
            for (int j = 0; j < matrixRight[0].length; j++)
                for (int k = 0; k < matrixRight.length; k++)
                    z [i][j] = z [i][j]+matrixLeft[i][k]*matrixRight[k][j];

        return z;
    }
}
