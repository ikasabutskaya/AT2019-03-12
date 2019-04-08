/*
package by.it.ikasabutskaya.at11;

import java.io.*;
import java.sql.SQLOutput;

public class TaskA {

    //внести в шаблон, могу использовать для всех остальных программ, работающих с файлами
    public static String dir(Class<?> cl) {
        String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String clDir=cl.getName().replace(cl.getSimpleName(),"").replace(".",File.separator);
        return path+clDir;
    }




    public static void main(String[] args) {
        DataOutputStream dos=null;
        try {
            dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(dir(TaskA.class)+"dataTaskA.bin"))
            );


            for (int i = 0, i < 20, i++) {
                dos.writeInt((int)(Math.random()*25));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if (dos !=null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (DataInputStream inp=new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(dir(TaskA.class)+"dataTaskA.bin"))
        ) {

            double sum=0;
            double count=0;
            while (inp.available()>0) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
