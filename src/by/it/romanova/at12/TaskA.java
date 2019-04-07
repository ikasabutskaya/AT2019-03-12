package by.it.romanova.at12;

import java.io.*;

public class TaskA {

    public static void main(String[] args) {
        int[][] array = new int [6][4];
        while (!generate(array));

        String filename = System.getProperty("user.dir") + "/src/by/it/romanova/at12/matrix.txt";

        saveArray(filename,array);
        printArray(filename);
    }

    private static void printArray(String filename) {
        try (BufferedReader r = new BufferedReader(new FileReader(filename))) {
            while (r.read()!=-1){
                String line = r.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveArray(String filename, int[][] array) {


        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            for (int[] row : array) {
                for (int element : row) {
                    out.printf("%3d ", element);
                }
                out.println();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static boolean generate(int[][] array) {
        boolean minus15 = false;
        boolean plus15 = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*31)-15;
                if(!minus15 && array[i][j] == -15)
                    minus15 = true;
                if(!plus15 && array[i][j] == 15)
                    plus15 = true;
            }
        }
        return minus15 && plus15;
    }

}
