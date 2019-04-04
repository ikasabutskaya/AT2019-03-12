package by.it.agrinkevich.at09;

import java.util.*;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Winner name for array list : " + process(new ArrayList<>(Arrays.asList("n1", "n2", "n3", "n4", "n5"))));
        System.out.println("Winner name for linked list : " + process(new LinkedList<>(Arrays.asList("n1", "n2", "n3", "n4"))));
    }

    static String process(ArrayList<String> peoples) {
        //System.out.println(peoples);
        return remover(peoples);
    }

    static String process(LinkedList<String> peoples) {
        return remover(peoples);
    }

    static String remover(List<String> peoples) {
        int index = 0;
        while (peoples.size() != 1) {
            Iterator<String> iterator = peoples.iterator();
            while(iterator.hasNext()) {
                iterator.next();
                if (index%2 != 0) {
                    iterator.remove();
                }
                index++;
            }
        }
        return peoples.get(0);
    }
}
