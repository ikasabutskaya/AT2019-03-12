package by.it.stanishevski.at04;

public class Helper {


    static double findMax(double[] arr) {
        if (0 == arr.length) {
            return Integer.MAX_VALUE;
        }
        else {
            double max = arr[0];
            for (double value : arr) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        }
    }

    static double findMin(double[] arr) {
        if (0 == arr.length) {
            return Integer.MIN_VALUE;
        }
        else {
            double min = arr[0];
            for (double value : arr) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        }
    }

    static void sort(double[] array) {
        boolean shift;
        int last = array.length - 1;
        do {
            shift = false;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    double buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    shift = true;
                }
            }
            last--;  // при каждой итерации цикла один элемент становится на место и длину проверяемого массива можно уменьшить на 1
        }
        while (shift);
        InOut.printArray(array); // print sorted array
    }
}
