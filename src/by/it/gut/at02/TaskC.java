package by.it.gut.at02;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {1, 9, 3, 4, 5, 6},
                {1, 9, 3, 4, 9, 6},
                {6, 5, 4, 3, 2, 1}

        };
        int[][] res = step3(arr);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));

        }

    }

    static int[][] step3(int[][] arr) {
        //find max
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max)
                    max = element;
            }
        }

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