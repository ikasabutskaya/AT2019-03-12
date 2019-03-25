package by.it.romanova.at03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        String line = readString();
        double[] str = InOut.getArray(line);
        InOut.printArray(str);
        InOut.printArray(str,"A",4);
        System.out.printf("Максимум массива = %.3f\n", Helper.findMax(str));
        System.out.printf("Минимум массива = %.3f\n", Helper.findMin(str));
        Helper.sort(str);
        double[][] mat1 = {
                {1,4,5},
                {4,7,8}
        };
        double[][] mat2 ={
                {1,6},
                {5,6},
                {8,3}
        };
        double[] vector = {3,7,5};
        Helper.mul(mat1,vector);
        Helper.mul(mat1,mat2);
    }

    private static String readString() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        return bufferedReader.readLine();
    }
}
