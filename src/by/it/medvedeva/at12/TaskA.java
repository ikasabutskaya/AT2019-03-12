package by.it.medvedeva.at12;

import java.io.*;

public class TaskA {
    public static void main(String[] args) {

        String filename = System.getProperty("user.dir")+"/src/by/it/medvedeva/at12/matrix.txt";

        int[][] array = new int [6][4];
        for (;!generate(array););

        try (BufferedReader r = new BufferedReader(
                new FileReader(filename)
        ))
        { while (true){

            String line = r.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(filename))){
            for (int [] row : array){

            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean generate(int[][] array) {
        boolean minus15 = false;
        boolean plus15 = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array [i][j]= (int) (Math.random()*31)-15;
                if(!minus15 && array[i][j] == -15)
                    minus15 = true;
            if(!plus15 && array[i][j] == -15)
                    plus15 = true;
                
            }
            
        }
    return  minus15 && plus15;
    }
}
