package by.it.gut.at04;

public class Helper {

    static double findMin(double[] arr) {
        double min = arr[0];
        for (int element = 0; element < arr.length; element++) {
            if (min > arr[element]) min = arr[element];
        }
        return min;
    }

    static void printMin(double min) {
        System.out.println(min);
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (int element = 0; element < arr.length; element++) {
            if (max < arr[element]) max = arr[element];
        }
        return max;
    }

    static void printMax(double max) {
        System.out.println(max);
    }

    static void sort(double[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    double x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }

    static void printSort(double[] arr) {
        System.out.println(arr);

    }
}

