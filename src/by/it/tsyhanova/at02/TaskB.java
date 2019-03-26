package by.it.tsyhanova.at02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args){
        step1();
        step1Alternative();

        System.out.println("Step2:");
        System.out.println("Введите порядковый номер месяца");
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        step2(month);
        System.out.println("Step3:");
        System.out.println("Введите три произвольных числа");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        step3(a,b,c);
    }

    private static void step3(double a, double b, double c) {
        double discriminant=b*b-4*a*c;
        if (discriminant > 0) {
            double rout1=(-(b)+Math.sqrt(discriminant))/(2*a);
            double rout2=(-(b)-Math.sqrt(discriminant))/(2*a);
            System.out.println("rout1:"+rout1+", rout2"+rout2);
        }
        else if(discriminant==0){
            double rout1=(-(b)+Math.sqrt(discriminant))/(2*a);
            System.out.println("rout1:"+rout1);
        }
        else if(discriminant<0){
            System.out.println("корней нет");
        }
    }

    private static void step2(int month){
        System.out.print("Введенный месяц - ");
        switch(month){
            case 1:System.out.println("январь");
            break;
            case 2:System.out.println("февраль");
            break;
            case 3:System.out.println("март");
            break;
            case 4:System.out.println("апрель");
            break;
            case 5:System.out.println("май");
            break;
            case 6:System.out.println("июнь");
            break;
            case 7:System.out.println("июль");
            break;
            case 8:System.out.println("август");
            break;
            case 9:System.out.println("сентябрь");
            break;
            case 10:System.out.println("октябрь");
            break;
            case 11:System.out.println("ноябрь");
            break;
            case 12:System.out.println("декабрь");
            break;
            default:System.out.println("нет такого месяца");
        }
    }

    private static void step1Alternative() {
        System.out.println("Step1: second variant");
        for(int i=0;i<5;i++){
            for(int j=1;j<6;j++){
                int num=i*5+j;
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }

    private static void step1() {
        System.out.println("Step1: first variant");
        int n=5;
        int l=25;
        for(int i=1;i<=l;i++){
            if(i%n==0){
                System.out.print(i+" ");
                System.out.print("\n");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
