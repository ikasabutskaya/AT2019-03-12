package by.it.simanovich.at02;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.println("Введите 10 чисел через пробел: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);
    }

    private static void step1(int[] mas){
        int min = mas[0];
        int max = mas[0];
        for (int element : mas) {
            if (min > element) min = element;
            if (max < element) max = element;
        }
        System.out.println(min + " " + max);
    }
    static void step2(int[ ] mas){
        double avg = 0;
        for (int element : mas) {
            avg = avg + element;
        }
        avg = avg / mas.length;
        System.out.println("Числа, которые строо меньше avg данного массива: ");
        for (int element : mas) {
            if (element < avg)
                System.out.print(element + " ");
        }
        System.out.println();
    }
    static void step3(int[ ] mas){
        int min = mas[0];
        for (int element : mas) {
            if (min > element) min = element;
        }
        System.out.println("Индекс самого маленького числа(чисел): ");
        for (int i = mas.length - 1; i >= 0; i--) {
            if(mas[i] == min)
                System.out.print(i + " ");
        }
    }

}



