package by.it.udalyou.at03;

public class Helper {

    static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static double[] sort(double[] arr) {

    /*    printMas(arr);
*/
        int j=1;

       while (j<arr.length) {
           int last = arr.length - j;
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    double buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
      /*          printMas(arr);
*/
            }
            j++;
        }
        return arr;
    }

 /*   private static void printMas(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    */
}