package by.it.romanova.at11;

import com.sun.tools.internal.ws.processor.util.DirectoryUtil;
import sun.rmi.rmic.iiop.DirectoryLoader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskC {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/by/it/romanova";
        StringBuilder str = new StringBuilder();

        File folder = new File(path);
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                System.out.println("dir:" + file.getName());
                str.append("dir:").append(file.getName()).append("\n");
                for (File listFile : file.listFiles()) {
                        System.out.println("\tfile:" + listFile.getName());
                        str.append("\tfile:").append(listFile.getName()).append("\n");
                }
            }
            else if (file.isFile()) {
                System.out.println("file:" + file.getName());
                str.append("file:").append(file.getName()).append("\n");
            }

        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "/at11/resultTaskC.txt"))) {
            bufferedWriter.write(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
