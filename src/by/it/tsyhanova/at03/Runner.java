package by.it.tsyhanova.at03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        double[] array=InOut.getArray(str);
        System.out.println("Задание 1");
        InOut.printArray(array);
        InOut.printArray(array,"V",3);

        System.out.println("\n"+"Задание 2");
        double minHelper=Helper.findMin(array);
        System.out.println("Минимальное значение = "+minHelper);
        double maxHelper=Helper.findMax(array);
        System.out.println("Максимальное значение = "+maxHelper);
        System.out.println("\n"+"Отсортированный массив");
        Helper.sort(array);

        System.out.println("\n"+"Задание 3");
        System.out.println("Введите 2 произвольных целых положительных числа");
        int a=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println("\n"+"Matrix 1");
        double[][] matrix1=new double[a][a];
        matrix1=Helper.getMatrix(a,c);
        System.out.println("\n"+"Matrix 2");
        double[][] matrix2=new double[a][a];
        matrix2=Helper.getMatrix(a,c);

        System.out.println("\n"+"Произведение матрицы 1 на матрицу 2");
        double[][] newMatrix=new double[a][a];
        newMatrix=Helper.mul(matrix1,matrix2);


        System.out.println("\n"+"Vector");
        double[] vector=new double[a];
        vector=Helper.getVector(a,c);
        System.out.println("\n"+"Произведение матрицы 1 на вектор");
        double[] newVectorMatrix=new double[a];
        newVectorMatrix=Helper.mul(matrix1,vector);
    }
}
