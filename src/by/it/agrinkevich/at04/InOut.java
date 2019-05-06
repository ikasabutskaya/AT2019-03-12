package by.it.agrinkevich.at04;

class InOut {
    static double[] getArray(String line) {
        String trim = line.trim();
        String[] strArray = trim.split(" ");
        double[] res = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            res[i] = Double.parseDouble(strArray[i]);
        }
        return res;
    }

    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int cols) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-8.3f ", name, i, arr[i]);
            if ((i + 1) % cols == 0)
                System.out.println();
        }
        System.out.println();
    }

    static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("% 10f",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
