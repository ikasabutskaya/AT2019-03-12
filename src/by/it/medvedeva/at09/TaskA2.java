package by.it.medvedeva.at09;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        List<Integer> integersA = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 6, 70000);
        List<Integer> integersB = Arrays.asList(10, 4, 5, 6, 7, 7, 78, 8, 9, 10);

        HashSet<Integer> a = new HashSet<>(integersA);
        TreeSet<Integer> b = new TreeSet<>(integersB);
        System.out.println("A:" + a);
        System.out.println("B" + b);

        Set<Integer> union = getUnion(a, b);
        System.out.println("union:" + union);
        Set<Integer> cross = getCross(a, b);
        System.out.println("cross:" + union);


    }

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;

    }

    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;


    }
}