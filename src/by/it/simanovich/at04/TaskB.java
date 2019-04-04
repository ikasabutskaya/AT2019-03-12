package by.it.simanovich.at04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        System.out.println("Введите число людей: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] surnames = new String[n];
        for (int i = 0; i < n; i++) {
            surnames[i] = scan.next();
        }

        int[][] salary = new int[n][4];
        for (int i = 0; i < surnames.length; i++) {
            System.out.println("Введите зарплату для " + surnames[i] + ":");
            for (int j = 0; j < salary[0].length; j++) {
                salary[i][j] = scan.nextInt();
            }
        }
        printTable(n, surnames, salary);
    }

    private static void printTable(int n, String[] surnames, int[][] salary) {
        System.out.println("==============================================================");
        System.out.printf("%10s %-10s%-10s%-10s%-10s%-7s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого" );
        int[] rowSum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("%10s: ", surnames[i]);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10d", salary[i][j]);
                rowSum[i] = rowSum[i] +salary[i][j];
            }
            System.out.printf("%-10d%n", rowSum[i]);
        }
        System.out.println("==============================================================");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + rowSum[i];
        }
        System.out.printf("%-10s%-10d%n","Итого", sum);
        System.out.printf("%-10s%-10.6f%n", "Средняя", (double)sum/n/4);
    }
}
