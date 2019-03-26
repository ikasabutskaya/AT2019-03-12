package by.it.gut.at03;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);


        double minElement = Helper.findMin(array);
        Helper.printMin(minElement);

        double maxElement = Helper.findMax(array);
        Helper.printMax(maxElement);

/*        double[] newArr = Helper.sort(array);
        Helper.sort(newArr);*/


    }
}
