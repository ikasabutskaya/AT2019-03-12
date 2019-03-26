package by.it.romanova.at04;

public class InOut {
    public static double[] getArray(String line) {

        String trim = line.trim();
        String[] strArray = trim.split(" ");
        double[] res = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            res[i] = Double.parseDouble(strArray[i]);
        }
        return res;
    }


    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + "");
        }
        System.out.println();
    }

    public static void printArray(double[] arr, String name, int cols) {
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[%-2d]=%-3.1f ",name,i,arr[i]);
            col++;
            if(((col % cols) == 0) || (col == (arr.length))){
                System.out.println();
            }
        }
    }
}
