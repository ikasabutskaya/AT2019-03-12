package by.it.udalyou.at12;

import by.it.udalyou.at08.Printer;

import java.io.*;

public class TaskA {

    public static void main(String[] args) {

String filename=System.getProperty("user.dir")+
        "/src/by/it/udalyou/at12/matrix.txt";

int [][] array=new int[6][4];
for (;!generate(array););
saveArray(filename,array);
readArrayLine(filename);


    }

    private static void readArrayLine(String filename) {
try (BufferedReader bf=new BufferedReader(new FileReader(filename))){
   while (true){
       String line=bf.readLine();
       if (line==null)break;
       System.out.println(line);
   }
} catch (IOException e) {
    e.printStackTrace();
}

    }

    private static void saveArray(String filename, int[][] array) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            for (int[] row : array) {
                for (int element : row){
                    out.printf("%3d ", element);
            }
            out.println();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//for (;!generate(array););
    private static boolean generate(int[][] array) {
boolean minus15=false;
boolean plus15=false;
for (int i=0;i<array.length;i++){
    for (int j=0;j<array[i].length;j++){
        array[i][j]=(int)(Math.random()*31)-15;
        if (!minus15&&array[i][j]==-15);
        minus15=true;
        if (!plus15&&array[i][j]==15);
        plus15=true;
       }
}
        boolean b = minus15 && plus15;
        return b;

    }

}
