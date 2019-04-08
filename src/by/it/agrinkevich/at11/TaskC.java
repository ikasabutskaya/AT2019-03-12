package by.it.agrinkevich.at11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskC {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/by/it/agrinkevich/";
        try (FileWriter fw = new FileWriter(path + "at11/resultTaskC.txt");
             PrintWriter pw = new PrintWriter(fw))
        {
            printDir(path, pw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printDir(String path, PrintWriter pw) {
        File file = new File(path);
        String name = file.getName();
        if (file.isFile()) {
            System.out.println("file:" + name);
            pw.println("file:" + name);

        } else if (file.isDirectory()) {
            if (!name.equals("") && !name.equals(""))
                System.out.println("dir:" + name);
                pw.println("dir:" + name);
            File[] paths = file.listFiles();
            if (paths != null)
                for (File iterator : paths) {
                    printDir(iterator.getAbsolutePath(), pw);
                }
        }
    }
}

