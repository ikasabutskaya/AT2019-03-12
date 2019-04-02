package by.it.agrinkevich.at09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskB3 {
    public static void main(String[] args) {
        String[] names = new String[4096];
        for (int i = 0; i < names.length; i++) {
            names[i] = "n" + i;
        }

        System.out.println("Start for Array list");
        long start = System.nanoTime();
        System.out.println("Winner name : " + process(new ArrayList<>(Arrays.asList(names))));
        System.out.println("Duration for Array list - " + (System.nanoTime() - start));

        System.out.println("Start for Linked list");
        start = System.nanoTime();
        System.out.println("Winner name : " + process(new LinkedList<>(Arrays.asList(names))));
        System.out.println("Duration for Linked list - " + (System.nanoTime() - start));
    }

    static String process(ArrayList<String> people) {
        Queue peopleQueue = new ArrayBlockingQueue(people.size(), true, people);
        return remover(peopleQueue);
    }

    static String process(LinkedList<String> people) {
        Queue peopleQueue = new LinkedBlockingQueue(people);
        return remover(peopleQueue);
    }

    static String remover(Queue<String> people) {
        int index = 0;
        while (people.size() != 1) {
            String headElement = people.poll();
            if (index % 2 == 0) {
                people.offer(headElement);
            }
            index++;
        }
        return people.peek();
    }
}
