package by.it.lugansky.at04;

import java.util.Arrays;

public class Helper {
    static double findMin(double[] arr) {
        sort(arr);

        return arr[0];

    }

    static double findMax(double[] arr) {
        sort(arr);


        return arr[arr.length - 1];

    }

    static void sort(double[] arr) {
        Arrays.sort(arr);


    }


    static double[] mul(double[][] matrix, double[] vector) {

        return new double[]{0.9};
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {

        return new double[][]{{0.8}};
    }
}
