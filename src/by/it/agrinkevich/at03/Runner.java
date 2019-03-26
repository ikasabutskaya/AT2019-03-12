package by.it.agrinkevich.at03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static by.it.agrinkevich.at03.Helper.*;
import static by.it.agrinkevich.at03.InOut.printArray;
import static by.it.agrinkevich.at03.InOut.printMatrix;


public class Runner {
    public static void main(String[] args) throws IOException {
        String line = readString();
        double[] arr = InOut.getArray(line);
        InOut.printArray(arr);
        InOut.printArray(arr, "A", 4);
        double[][] matrixA = {{1.5, 5.2, 2.0}, {6.2, 3.0, 9.22}};
        double[][] matrixB = {{3.8, 88.1}, {7.23, 12.33}, {32.54, 2.3}};
        double[] vector = {4.6, 3.2, 1.0};

        findMin(arr);
        findMax(arr);

        sort(arr);
        double[] vectorB = mul(matrixA, vector);
        System.out.println("Произведение матрицы на вектор: ");
        printArray(vectorB);
        System.out.println("Произведение матрицы на матрицу: ");
        double[][] resMatrixC = mul(matrixA, matrixB);
        printMatrix(resMatrixC);
    }

    private static String readString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }


}
