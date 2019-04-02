package by.it.udalyou.at04;

import java.util.Scanner;

public class TaskB {

public static void main (String[] args) {
    System.out.println("Ввести число служащих");

    Scanner scanner = new Scanner(System.in);
    int col = scanner.nextInt();
    System.out.println("Последовательно ввести фамилии служащих");
    String[] sonm = new String[col];

    for (int i = 0; i < col; i++) {
        sonm[i] = scanner.next();
    }
    int[][] arr = new int[col][4];//массив для ЗП за 4-е квартала
    int[] sum = new int[col]; //массив для суммы по сотруднику

    for (int i = 0; i < col; i++) {
        System.out.println("Введите зарплату для " + sonm[i]);
        for (int j = 0; j < 4; j++) {
            arr[i][j] = scanner.nextInt();
            sum[i] = sum[i] + arr[i][j];
        }
    }
    int all = 0;
    for (int i = 0; i < col; i++) {
        all = all + sum[i];  //вычисление Итого
    }
    double medd = (double) all / (4 * col);  //вычисление средней ЗП



    System.out.println("--------------------------------------------------------");

    System.out.printf("%-9s%-10s%-10s%-10s%-10s%-10s%n","Фамилия","Квартал 1","Квартал 2","Квартал 3","Квартал 4","Итого");
    System.out.println("--------------------------------------------------------");
    for (int i=0;i<col;i++){
        int j=0;
      //  System.out.print(sonm[i]);
      //  for (int j=0;j<4;j++){
        //System.out.print(arr[i][j]);
        //}
        //System.out.println(sum[i]);
          System.out.printf("%-9s%-10d%-10d%-10d%-10d%-10d%n",sonm[i],arr[i][j],arr[i][j+1],arr[i][j+2],arr[i][j+3],sum[i]);
         }
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-9s%-10d%n","Итого",all);
    System.out.printf("%-9s%-10.4f%n","Средняя",medd);

}

}








