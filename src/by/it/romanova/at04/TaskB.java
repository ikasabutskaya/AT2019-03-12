package by.it.romanova.at04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        String[] array = new String[people];
        int[][] salaries = new int[people][4];
        int[] sum = new int[people];
        double resultSum = 0;
        double average = 0;

        for (int i = 0; i < people; i++) {
            array[i] = sc.next();
        }


        for (int i = 0; i < people; i++) {
            System.out.println("Введите зарплату для " + array[i]);
            for (int j = 0; j < salaries[0].length; j++) {
                salaries[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < people; i++) {
            sum[i]=0;
            for (int j = 0; j < 4; j++) {
                sum[i] = sum[i] + salaries[i][j];
            }
            resultSum = resultSum + sum[i];
        }


        average = resultSum/4/people;

        System.out.println("-----------------------------------------------------");
        System.out.printf("%-12s%-9s%-9s%-9s%-9s%-7s%n","Фамилия","Квартал1","Квартал2","Квартал3","Квартал4","Итого");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < people; i++) {
            System.out.printf("%-12s%-9s%-9s%-9s%-9s%-7s%n",array[i],salaries[i][0],salaries[i][1],salaries[i][2],salaries[i][3],sum[i]);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-12s%-9f%n","Итого",resultSum);
        System.out.printf("%-12s%-4.4f%n","Средняя",average);

    }
}
