package by.it.ikasabutskaya.at09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {

/*    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String str;

        int pos=0;
        while (!(str = scan.nextLine()).equals("end")) {
            Integer value = Integer.valueOf(str);
            if (value>0)
                arr.add(pos++,value);
            else if (value==0)
                arr.add(pos,0);
            else
                arr.add(value);
        }
        System.out.println(arr);
    }*/

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int pos = 0;

        for (; ; ) {
            String s = scanner.next();
            if (s.equals("end")) break;
            Integer i = Integer.valueOf(s);
            if (i < 0)
                list.add(i);
            else if (i == 0)
                list.add(pos, i);
            else
                list.add(pos++, i);
        }

        System.out.println(list);
    }

}
