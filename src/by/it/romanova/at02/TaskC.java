package by.it.romanova.at02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.fail;

public class TaskC {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        //int[][] m = new int[n][n];
//        int[][] mas = step1(n);
        int[][] arr = {
                {1,2,3,4,5,6},
                {1,9,3,4,5,6},
                {1,9,3,4,9,6},
                {6,5,4,3,2,1}
        };
        int[][] res = step3(arr);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }

    }

    private static int[][] step1(int n) {
        int[][] mas = new int[n][n];
        // int[][] m = new int[n][n];
        int a = -5;
        int b = 5;
        int i, j;
        boolean check_min = false;
        boolean check_max = false;
        do {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    int rn = ThreadLocalRandom.current().nextInt(a, b + 1);
                    mas[i][j] = rn;
                }
            }

            int min = mas[0][0];
            int max = mas[0][0];
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (min > mas[i][j]) min = mas[i][j];
                    if (max < mas[i][j]) max = mas[i][j];
                }
            }
            if(min==-5) check_min = true;
            if(max==5) check_max = true;

        } while (!check_min || !check_max);


        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

        return mas;
    }

//    static int step2(int[][] mas){
//        int sum = 0;
//        for (int i = 0, n = mas.length; i < n; i++) {
//            sum += sumBetweenPositiveOfRow(matrix[i]);
//        }
//
//        return sum;
//
//    }

    static int[][] step3(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element>max)
                    max=element;
            }

        }


    boolean[] delRow=new boolean[arr.length];
    boolean[] delCol=new boolean[arr[0].length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]==max) {
                    delRow[i] = true;
                    delCol[j] = true;
                }
            }
        }

        int rowCount=0;
        int colCount=0;
        for (boolean del : delRow) if (!del) rowCount++;
        for (boolean del : delCol) if (!del) colCount++;

        int[][] res = new int[rowCount][colCount];
        int ires=0;
        for (int i = 0; i <arr.length ; i++) {
            if (delRow[i]==false) {
                int jres = 0;
                for (int j = 0; j < arr[0].length; j++) {
                    if (delCol[j] == false) {
                        res[ires][jres] = arr[i][j];
                        jres++;
                    }
                }
                ires++;
            }
        }

        return res;
    }


}
