package by.it.akhmelev.at03;

class InOut {

    static double[ ] getArray(String line){
        String[] split = line.trim().split(" ");
        double[] arr=new double[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Double.parseDouble(split[i]);
        }
        return arr;
    }

    static void printArray(double[ ] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.3f",name,i,arr[i]);
            if ((i+1)%columnCount==0)
                System.out.println();
        }
        System.out.println();
    }


}
