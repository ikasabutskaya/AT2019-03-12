package by.it.stanishevski.at04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        System.out.println("Введи число людей");
        Scanner scanner = new Scanner(System.in);
        int qty = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введи фамилии, используя клавишу ENTER");
        String[] lastName = new String[qty];
        for (int i = 0; i <qty; i++) {
            lastName[i] = scanner.next();

        }
         System.out.println("Введи зарплаты"); //Ввод зарплат для n людей и за 4 квартала
         int [][] tabel = new int[qty][4];
         int[] sumTabel=new int[qty];
         int sum=0;
            for(int i=0; i<qty;i++){
                int sumPerson=0;
                System.out.println("Введите через пробелы зарплаты за 4 квартала для "+lastName[i]);
                for(int j=0;j<4;j++) {
                    tabel[i][j] = scanner.nextInt();
                    sumPerson=sumPerson+tabel[i][j];
                    sum=sum+tabel[i][j];
                }
                sumTabel[i]=sumPerson;
            }


        double medSalary=(double)sum/(qty*4);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-12s%-10s%-10s%-10s%-10s%-10s%n","Фамилия","Квартал1","Квартал2","Квартал3","Квартал4","Итого");
        System.out.println("---------------------------------------------------------");
        for(int i=0;i<qty;i++){
            int j=0;
            System.out.printf("%-12s%-10d%-10d%-10d%-10d%-10d%n",lastName[i],tabel[i][j],tabel[i][j+1],tabel[i][j+2],tabel[i][j+3],sumTabel[i]);
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-9s%-10d%n","Итого",sum);
        System.out.printf("%-12s%-10.4f%n","Средняя",medSalary);    }
    }
