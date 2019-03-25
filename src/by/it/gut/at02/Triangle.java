package by.it.gut.at02;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[][]  t = new int[10][0];
        for (int i = 0; i < 10; i++) {
            t[i]=new int[i+3];
            for (int j = 0; j < t[i].length; j++) {
                t[i][j]=i+j;

            }
        }

        for (int[] row : t) {
            System.out.println(Arrays.toString(row));;

        }
    }
}
