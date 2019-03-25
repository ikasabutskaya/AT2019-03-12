package by.it.tsyhanova.at02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args){
        System.out.println("Введите строку из 10 чисел");
        Scanner scan=new Scanner(System.in);
        int[] mas=new int[10];
        for(int i=0;i<mas.length;i++){
            //ввод данных через scanner идет в main!!!
            mas[i]=scan.nextInt();
        }
        for(int i=0;i<mas.length;i++){
            System.out.print("mas["+i+"]="+mas[i]+", ");
        }
        System.out.println(" ");
        //TaskA 3 methods
        step1(mas);
        step2(mas);
        step3(mas);
    }

    private static void step3(int[] mas) {
        System.out.println("Step3");
        int min=mas[0];
        for(int element:mas){
            if(min>element)min=element;
        }
        for(int i=mas.length-1;i>=0;i--){
            if(mas[i]==min){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }

    private static void step2(int[] mas) {
        System.out.println("Step2");
        int num=0;
        double median;
        for(int i=0;i<mas.length;i++){
            num=num+mas[i];
        }
        median=num/mas.length;
        for(int i=0;i<mas.length;i++){
            if(mas[i]<median){
                System.out.print(mas[i]+", ");
            }
        }
        System.out.println(" ");
    }

    private static void step1(int[] mas) {
        System.out.println("Step1");
       int min=mas[0];
       int max=mas[0];
       for(int element:mas){
           if(element<min) min=element;
           if(element>max) max=element;
       }
       System.out.println(min+" "+max);
    }
}
