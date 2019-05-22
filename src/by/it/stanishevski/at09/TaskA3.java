package by.it.stanishevski.at09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TaskA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int posZero = 0;

        for (; ; ) {
            String s = scanner.next();
            if (s.equals("end")) break;
            Integer i = Integer.valueOf(s);
            if (i < 0) list.add(i);
            else if (i == 0) list.add(posZero, i);
            else list.add(posZero++, i);
        }
        System.out.println(list);
    }
}