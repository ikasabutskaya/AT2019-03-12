package by.it.tsyhanova.at04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        //Ввод числа служащих
        System.out.println("Введите произвольное целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //Ввод фамилий служащих
        System.out.println("Введите соответствующие фамилии, используя клавишу ENTER");
        String[] str = new String[num];
        for (int i = 0; i <num; i++) {
            str[i] = scanner.next();
        }
        //сканер должен считать пустую строку для перехода к вводу поквартальных зарплат, иначе возникнут
        //сложности с занесением зарплаты первого сотрудника
        //вместо сканера можно использовать BufferedReader
        scanner.nextLine();
        System.out.println("Введите данные зарплат каждого сотрудника за 4 квартала");
        int[][] wageStr=new int[num][4];
        int[] sumWagePerson=new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            int sumPerson=0;
            System.out.println("Введите зарплату для "+str[i]);
            for(int j=0;j<4;j++) {
                wageStr[i][j] = scanner.nextInt();
                sumPerson=sumPerson+wageStr[i][j];
                sum=sum+wageStr[i][j];
            }
            sumWagePerson[i]=sumPerson;
        }













        double medianWage=(double)sum/(num*4);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-9s%-10s%-10s%-10s%-10s%-10s%n","Фамилия","Квартал 1","Квартал 2","Квартал 3","Квартал 4","Итого");
        System.out.println("---------------------------------------------------------");
        for(int i=0;i<num;i++){
            int j=0;
            System.out.printf("%-9s%-10d%-10d%-10d%-10d%-10d%n",str[i],wageStr[i][j],wageStr[i][j+1],wageStr[i][j+2],wageStr[i][j+3],sumWagePerson[i]);
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-9s%-10d%n","Итого",sum);
        System.out.printf("%-9s%-10.4f%n","Средняя",medianWage);
    }
}
