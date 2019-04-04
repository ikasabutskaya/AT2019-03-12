package by.it.simanovich.at03;

public class Helper {


    static double findMin(double[] arr) {
        double min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }


    static double findMax(double[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;

    }


    static void sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr [j + 1] = arr[j];
                j--;
            }// end while loop
            arr [j + 1] = key;
        }

    }
}
