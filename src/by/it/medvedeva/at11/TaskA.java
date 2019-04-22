package by.it.medvedeva.at11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {
    public static void main(String[] args) {
        
        String path = System.getProperty("user.dir")+ "/src/by/it/medvedeva/at11/";
        try (FileOutputStream fos = new FileOutputStream("dataTaskA.bin");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(bos);)
        {
            for (int i = 0; i <20 ; i++) {
                int value = (int) (Math.random() * 100);
                dos.writeInt(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path+"dataTaskA.bin");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);)
        {
            while (dis.available()>0)
                list.add(dis.readInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(path+ "resultTaskA.txt");
             PrintWriter txt = new PrintWriter(fw);){

        } catch (IOException e) {
            e.printStackTrace();
        }
        double sum = 0;
        for (Integer element : list){
            System.out.println(element + " ");
            sum = sum+element;
        }
        System.out.println("\navg="+sum/list.size());

    }



}
