package by.it.akhmelev.at09;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        //это неполноценный лист а массив на интерфейсе
        List<Integer> integersA = Arrays.asList(1, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7);
        List<Integer> integersB = Arrays.asList(10, 4, 5, 6, 7, 7, 7, 7, 78, 9, 10);
        HashSet<Integer> a = new HashSet<>(integersA);
        TreeSet<Integer> b = new TreeSet<>(integersB);
        System.out.println("A: "+a);
        System.out.println("B: "+b);

        Set<Integer> union = getUnion(b, a);
        System.out.println("union:"+union);
        Set<Integer> cross = getCross(b, a);
        System.out.println("cross:"+cross);
    }

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set<Integer>result=new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        Set<Integer>result=new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

}
