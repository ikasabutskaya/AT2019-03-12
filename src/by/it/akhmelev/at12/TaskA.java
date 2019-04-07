package by.it.akhmelev.at12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TaskA {
    public static void main(String[] args) {
        String filename=System.getProperty("user.dir")+
                "/src/by/it/akhmelev/at12/matrix.txt";

        int[][] array=new int[6][4];
        for (;!generate(array););

        saveArray(filename, array);
        readArrayLines(filename);
    }

    private static void readArrayLines(String filename) {
//        try {
//            Files.lines(Paths.get(filename)).forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (BufferedReader r=new BufferedReader(
                new FileReader(filename)
        )){
            while (true){
                String line=r.readLine();
                if (line==null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveArray(String filename, int[][] array) {
        try (PrintWriter out=new PrintWriter(new FileWriter(filename))){
            for (int[] row : array) {
                for (int element : row) {
                    out.printf("%3d ",element);
                }
                out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static boolean generate(int[][] array) {
        boolean minus15=false;
        boolean plus15=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*31)-15;
                if (!minus15 && array[i][j]==-15)
                    minus15=true;
                if (!plus15 && array[i][j]==15)
                    plus15=true;
            }
        }
        return minus15 && plus15;
    }
}
