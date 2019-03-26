package by.it.tsyhanova.at03;

public class Helper {
    /**
     * @param arr входной массив
     */
    static double findMin(double[ ] arr) {
        /**
         * @param min элемент массива с минимальным значением
         */
        double min=arr[0];
        for (int i=0;i<arr.length;i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        /**
         * @return возвращает минимальный элемент массива
         */
        return min;
    }

    static double findMax(double[ ] arr){
        double max=arr[0];
        for (int i=0;i<arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static void sort(double[ ] arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double glass = arr[i];
                    arr[i] = arr[j];
                    arr[j] = glass;
                }
            }
        }
        for(double element:arr){
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }

    static double[][] getMatrix(int a, int c){
        double[][] matrix=new double[a][];
        for(int i=0;i<a;i++){
            matrix[i]=new double[a];
            for(int j=0;j<a;j++){
                matrix[i][j]=(double)Math.round(Math.random()*c);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return matrix;
    }

    static double[] getVector(int a, int c){
        double[] vector=new double[a];
        for(int i=0;i<a;i++){
            vector[i]=(double)Math.round(Math.random()*c);
            System.out.print(vector[i]+" ");
            }
            System.out.println();
        return vector;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double[][] result=new double[matrixLeft.length][matrixLeft.length];
        for(int i=0;i<matrixLeft.length;i++){
             for(int j=0;j<matrixRight[i].length;j++){
                for(int k=0;k<matrixRight.length;k++){
                    result[i][j]=result[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        return result;
    }

     static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
        double[] z=new double[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<vector.length;j++){
                z[i]=z[i]+matrix[i][j]*vector[j];
                System.out.print(z[i]+" ");
            }
        }
        return z;
    }
}
