package by.it.udalyou.at03;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        double[] arr = InOut.getArray(line);
        InOut.printArray(arr);
        InOut.printArray(arr, "aVa", 4);
        double min = Helper.findMin(arr);
        System.out.println("Минимум масива Min=" + min);
        double max = Helper.findMax(arr);
        System.out.println("Максимум масива Max=" + max);
        double[] sort = Helper.sort(arr);
        System.out.println("Отсортированный масив:");
        InOut.printSort(sort, "aVa", 4);
        System.out.println("Введите Вектор:");
        String str = scanner.nextLine();
        double[] vector = InOut.getArray(str);
        System.out.println("Вектор ");
        InOut.printArray(vector);
        System.out.println("Введите число строк Матрицы А:");
        int a = scanner.nextInt();
        System.out.println("Введите число столбцов Матрицы А:");
        int b = scanner.nextInt();
        System.out.println("Матрица А формируется случайным образом");
        double[][] matrix = gatMatrix(a, b);
        // for(double[] m:matrix) System.out.print(m+ " ");
       // for (int i = 0; i < a; i++) {
        //   for (int j = 0; j < b; j++) {
         //  System.out.printf("%10.4f%n", matrix[i][j]);

         //   }
         //   System.out.println();
        //}
        Helper.mul(matrix,vector);
        System.out.println("Результат умножения матрицы и вектора:");

        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Введите число строк Матрицы В:");
      int c=scanner.nextInt();
        System.out.println("Введите число столбцов Матрицы В:");
       int d=scanner.nextInt();
        double[][] matrixRight=matrix;

        System.out.println("Матрица B формируется случайным образом");
        double[][] matrixLeft = gatMatrix(c, d);
        Helper.mul(matrixLeft,matrixRight);
        System.out.println("Результат умножения матрицы на матрицу:");

       // InOut.arrayPrint2D(mul);

        System.out.println("Все");

      }

    private static double[][] gatMatrix(int a, int b) {
        double arr[][]=new double[a][b];

        boolean minus = false;
        boolean plus = false;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (double) (Math.random() * 21) - 10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        return arr;
    }
    }
