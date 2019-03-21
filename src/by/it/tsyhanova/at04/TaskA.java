package by.it.tsyhanova.at04;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args){
        printMulTable();
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        buildOneDimArray(str);

    }
    // Таблица умножения от 2 до 9 включительно
    private static void printMulTable(){
        for(int i=2;i<10;i++){
            for(int j=2;j<10;j++){
                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
            }
            System.out.println();
        }
        System.out.println("\n"+"Напечатайте 10 произвольных чисел через пробел");
    }


    private static void buildOneDimArray(String line){
        //получение массива вещественных чисел  из строки класса InOut
        double[] array=InOut.getArray(line);
        //распечатка массива по 5 элементов в строке
        InOut.printArray(array,"V",5);
        double first=array[0];
        double last=array[array.length-1];
        //отсортировать массив
        Helper.sort(array);
        //вывести отсортированный массив в 4 колонки
        InOut.printArray(array,"V",4);
        //выполнить вычисление новых (после сортировки) индексов первого
        // и последнего элемента исходного массива и напечатать их
        for(int i=0;i<array.length;i++){
            if(array[i]==first){
                System.out.println("Index of first element="+i);
                break;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==last){
                System.out.println("Index of last element="+i);
                break;
            }
        }
        System.out.println();
    }

}
