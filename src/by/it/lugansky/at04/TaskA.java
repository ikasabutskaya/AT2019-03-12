package by.it.lugansky.at04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {

    private static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d*%d=%-2d ", i, j, i * j);

            }
            System.out.println();

        }
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        Helper.sort(array);
        InOut.printArray(array, "V", 4);

        for (int i = 0; i < array.length; i++) {
            if (first == array[i]) {
                System.out.println("Index of first element=" + i);
                break;
            }
        }
        int indexLast = Arrays.binarySearch(array, last);
        System.out.println("Index of last element=" + indexLast);
    }

    public static void main(String[] args) {
        printMulTable();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        buildOneDimArray(s);
    }

}

