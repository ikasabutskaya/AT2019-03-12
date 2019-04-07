package by.it.romanova.at11;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TaskB {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "/src/by/it/romanova/at11/";

        try (Reader fr = new FileReader(path+"text.txt");
            BufferedReader br = new BufferedReader(fr)
            ){

            ArrayList<String> arr = new ArrayList<>();
            while (br.read()>0){
                arr.add(br.readLine());
            }
//
//            Pattern symbols = Pattern.compile("[^(\\w\\s)]");
//            Matcher m = symbols.
//
//            for (String s : arr) {
//                s.m
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
