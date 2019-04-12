package by.it.ikasabutskaya.at02;

import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        step1(n);
        //step2();


    }


    private static int[][] step1 (int n) {
        int mas[][] = new int[n][n];
        Boolean hasMinusN = false;
        Boolean hasPlusN = false;
        int rnd;
        while (hasMinusN == false || hasPlusN == false) {
            hasMinusN = false;
            hasPlusN = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rnd = (int) (Math.random() * (2 * n + 1)) - n;
                    if (rnd == n) hasPlusN = true;
                    if (rnd == -n) hasMinusN = true;
                    mas[i][j] = rnd;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.print("\n");
        }
        return mas;
    }


    private static int step2(int[][] mas) {

        int summ = 0;
        boolean firstPositive;
        int n = mas.length;
        for (int i = 0; i < n; i++) {
            firstPositive = false;
            for (int j = 0; j < n; j++) {
                if (mas[i][j] > 0 && firstPositive == false) {
                    firstPositive = true;
                } else if (mas[i][j] > 0 & firstPositive == true) {
                    break;
                }
                if (mas[i][j] < 1 & firstPositive == true) {
                    summ += mas[i][j];
                }
            }
        }
        System.out.printf("%d\n", summ);
        return summ;
    }


    static int[][] step3(int[][] arr) {

        //MAX
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max)
                    max = element;
            }
        }

        //Массивы с признаками удаления
        boolean[] delRow = new boolean[arr.length];
        boolean[] delCol = new boolean[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    delRow[i] = true;
                    delCol[j] = true;
                }
            }
        }

        int rowCount = 0;
        for (boolean del : delRow) if (!del) rowCount++;

        int colCount = 0;
        for (boolean del : delCol) if (!del) colCount++;

        int[][] res = new int[rowCount][colCount];
        int ires = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delRow[i] == false) {
                int jres = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    if (delCol[j]==false){
                        res[ires][jres]=arr[i][j];
                        jres++;
                    }
                }
                ires++;
            }
        }
        return res;
    }


}
