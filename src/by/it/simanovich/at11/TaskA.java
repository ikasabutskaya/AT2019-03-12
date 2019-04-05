package by.it.simanovich.at11;

import java.io.*;

public class TaskA {

    public static void main(String[] args) {


        try {
            File file = new File("dataTaskA.bin");
            file.createNewFile();

            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < 20; i++) {

                fos.write((int) (Math.random() * 10));

            }
            fos.close();


            BufferedReader br = new BufferedReader(new FileReader("dataTaskA.bin"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();



        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
