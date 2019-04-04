package by.it.simanovich.at03;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        double [] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        double min = Helper.findMin(array);
        System.out.println(min);
        double max = Helper.findMax(array);
        System.out.println(max);
        Helper.sort(array);

    }
}
