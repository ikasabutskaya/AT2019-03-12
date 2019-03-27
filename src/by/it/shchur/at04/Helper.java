package by.it.shchur.at04;

import java.util.Arrays;
import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array;
        if (str.length()>0){
            array = InOut.getArray(str);
            System.out.println(findMin(array));
            System.out.println(findMax(array));
            sort(array);
            InOut.printArray(array);
        }
        else System.out.println("Array is empty");


    }


    static double findMin(double[] arr){
        double min=arr[0];
        if (arr.length==0) {
            //System.out.println("Array is empty");
            return 0;
        }
        else{

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i]<min) min=arr[i];
            }
            return(min);
        }
    }

    static double findMax(double[] arr){
        double max=arr[0];
        if (arr.length==0) {
            //System.out.println("Array is empty");
            return 0;
        }
        else{
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i]>max) max=arr[i];
            }
            return (max);
        }
    }
    static void sort(double[ ] arr) {
        Arrays.sort(arr);
        }

    static double[ ] mul(double[][] matrix, double[] vector){
        double [] resultArray = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < vector.length ; j++)
                resultArray[i]=resultArray[i]+matrix[i][j]*vector[j];
        return resultArray;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double [][] resultArray = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++)
            for (int j = 0; j < matrixRight[0].length ; j++)
                for (int k = 0; k < matrixRight.length; k++) {
                    resultArray[i][j]=resultArray[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }

        return resultArray;

    }
}
