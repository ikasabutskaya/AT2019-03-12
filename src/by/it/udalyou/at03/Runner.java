package by.it.udalyou.at03;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        double[] arr = InOut.getArray(line);
        InOut.printArray(arr);
        InOut.printArray(arr, "aVa",4);
        double min= Helper.findMin(arr);
        System.out.println("Минимум масива Min="+min);
        double max= Helper.findMax(arr);
        System.out.println("Максимум масива Max="+max);
        double[] sort= Helper.sort(arr);
        InOut.printSort(sort,"aVa",4);

    }
}