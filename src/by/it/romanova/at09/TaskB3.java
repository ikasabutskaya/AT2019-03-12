package by.it.romanova.at09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskB3 {
    public static void main(String[] args) {
        ArrayList<String> peopleArray = new ArrayList<>(Arrays.asList("кот", "мот", "компот", "енот", "крот", "жмот"));
        LinkedList<String> peopleLinked = new LinkedList<>(peopleArray);

        System.out.println(process(peopleArray));
        System.out.println(process(peopleLinked));


    }

    static String process(ArrayList<String> people){

        long startTime = System.nanoTime();

        int count = people.size();
        int i = 1;
        do {
            Iterator iterator = people.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (i % 2 == 0) {
                    iterator.remove();
                    count--;
                }
                i++;
            }
        } while (count > 1);

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        return people.get(0);

    }

    static String process(LinkedList<String> people){

        long startTime = System.nanoTime();

        int count = people.size();
        int i = 1;
        do {
            Iterator iterator = people.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (i % 2 == 0) {
                    iterator.remove();
                    count--;
                }
                i++;
            }
        } while (count > 1);

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        return people.get(0);

    }

}
