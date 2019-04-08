package by.it.romanova.at09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TaskC1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String word;
        while (!(word = sc.next()).equals("end")){
            arr.add(word);
        }
        System.out.println(arr);
    }

}
