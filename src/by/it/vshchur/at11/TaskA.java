package by.it.vshchur.at11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {

    public static String dir(Class<?> cl) {
        //для работы на всех операционках с \ и / в пути используется File.pathSeparator
        String path = System.getProperty("user.dir") + File.separator + "src"+File.separator;
        String clDir = cl.getName().replace(cl.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }

    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(dir(TaskA.class) + "dataTaskA.bin")));
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 25));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        try (DataInputStream inp = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(dir(TaskA.class) + "dataTaskA.bin")));
        PrintWriter out2 = new PrintWriter(
                new FileWriter(dir(TaskA.class)+ "resultTaskA.txt"))) {
            double sum = 0;
            double count = 0;
            while (inp.available() > 0) {
                int i = inp.readInt();
                System.out.print(i+" ");
                out2.print(i+" ");
                sum = sum + i;
                count++;
            }
            System.out.println("\navg="+sum/count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

//        String path =
//
//        //writeInt
//        writeInt();
//
//        //readInt
//        List<Integer> list = readInt(path);
//
//        //printInt
//        FileWriter fw = new FileWriter((path + "dataTaskA.txt"));
//        double sum = 0;
//        for (Integer element: list){
//            System.out.print(element+ " ");
//            dos.writeInt
//        }
//
//    }
//
//    private static List<Integer> readInt(String path) {
//        List<Integer> list = new ArrayList<>();
//        try (FileInputStream fis = new FileInputStream(path + "dataTaskA.bin");
//             BufferedInputStream bis = new BufferedInputStream(fis);
//             DataInputStream dis = new DataInputStream(bis);) {
//
//            while (dis.available() > 0) list.add(dis.readInt());
//
//        } catch (IOException /* | FileNotFoundException */ e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    private static void writeInt() {
//        try (FileOutputStream fos = new FileOutputStream("dataTaskA.bin");
//             BufferedOutputStream bos = new BufferedOutputStream(fos);
//             DataOutputStream dos = new DataOutputStream(bos);) {
//            for (int i = 0; i < 20; i++) {
//                int value = (int) (Math.random() * 100);
//                dos.writeInt(value);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }