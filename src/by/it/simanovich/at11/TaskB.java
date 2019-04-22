package by.it.simanovich.at11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class TaskB {

    public static void main(String[] args) {

        Collection lines = new ArrayList();
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("by/it/simanovich/at11/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine = null;
        while (true) {
            try {
                if (!((strLine = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((ArrayList) lines).add(strLine);

        }
    }
}