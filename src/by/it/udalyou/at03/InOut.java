package by.it.udalyou.at03;

/**
 * Created by user on 16.03.2019.
 */
public class InOut {
    static double[] getArray(String line) {

        String[] strArry = line.split(" ");
        double[] res = new double[strArry.length];
        for (int i = 0; i < strArry.length; i++) {
            res[i] = Double.parseDouble(strArry[i]);
        }
        return res;
    }

    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || i + 1 == arr.length)
                System.out.println();
        }
    }

    static void printSort(double[] sort, String name, int columnCount) {
        for (int i = 0; i < sort.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, sort[i]);
            if ((i + 1) % columnCount == 0 || i + 1 == sort.length)
                System.out.println();
        }
    }
    static void arrayPrint2D(double[][] m){
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++)
                System.out.printf("%10.4f",m[i][j]);
            System.out.println();
        }
    System.out.println();
}



}



