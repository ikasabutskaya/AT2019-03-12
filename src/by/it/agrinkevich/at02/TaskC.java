package by.it.agrinkevich.at02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        System.out.print("Введите размерность квадратной матрицы: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mas[][] = new int[n][n];

        step1(n);
        step2(mas);

        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {1, 9, 3, 4, 5, 6},
                {1, 9, 3, 4, 9, 6},
                {6, 5, 4, 3, 2, 1},
        };
        step3(arr);

        System.out.println("Задание С3: ");
        int[][] res = step3(arr);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] step1(int n) {
        boolean isMinDetected = false;
        boolean isMaxDetected = false;
        int mas[][] = new int[n][n];
        Random r = new Random();

        while (!isMaxDetected || !isMinDetected) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int current = mas[i][j];
                    if (current == n || current == -n) continue;

                    int num = r.nextInt(2*n+1)-n;
                    mas[i][j] = num;
                    if (num == n) {
                        isMaxDetected = true;
                    }
                    if (num == -n) {
                        isMinDetected = true;
                    }
                    if (isMaxDetected && isMinDetected) break;
                }
                if (isMaxDetected && isMinDetected) break;
            }
        }
        System.out.println("Задание C1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        return mas;
    }

    private static int step2(int[][] mas){
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            boolean isStarted = false;
            for (int j = 0; j < mas.length; j++) {
                int current = mas[i][j];
                if (!isStarted) {
                    if (current > 0 ) {
                        isStarted = true;
                    }
                } else {
                    //если второго положительного не будет в строке, то считается вся строка до конца
                    if (current > 0) {
                        break;
                    } else {
                        sum = sum + current;
                    }
                }
            }
        }
        System.out.println("Задание C2: сумма элементов исходной матрицы mas,\n" +
                "расположенных между первым и вторым положительными элементами\n" +
                "каждой строки: " + sum);
        return sum;
    }

    private static int[][] step3(int[][] mass) {

        //Max
        int max = getMax(mass);

        // Массивы с признаками удаления
        boolean[] delRow = new boolean[mass.length];
        boolean[] delCol = new boolean[mass[0].length];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == max) {
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
        for (int i = 0; i < mass.length; i++) {
            if (!delRow[i]) {
                int jres = 0;
                for (int j = 0; j < mass[i].length; j++) {
                    if (!delCol[j]){
                        res[ires][jres]=mass[i][j];
                        jres++;
                    }
                }
                ires++;
            }
        }
        return res;
    }

    private static int getMax(int[][] mass) {
        int max = Integer.MIN_VALUE;
        for (int[] row : mass) {
            for (int element : row) {
                if (element > max)
                    max = element;
            }
        }
        return max;
    }
}
