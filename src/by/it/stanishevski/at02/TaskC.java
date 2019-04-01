package by.it.stanishevski.at02;


import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] mas = new int[n][n];
        step1(n);
        //step2(mas);
    }


    public static int[][] step1(int n) {
        int i = 0;
        int j = 0;
        int[][] mas = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * (n - (-n) + 1)) + (-n);
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
        return mas;
    }}









