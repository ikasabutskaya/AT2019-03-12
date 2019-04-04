package by.it.romanova.at09;

import java.util.*;

public class TaskA2 {

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,4,4,5,5,6));
        TreeSet<Integer> b = new TreeSet<>(Arrays.asList(9,8,7,4,4,4,5,5,6));
        System.out.println(getCross(a,b));
        System.out.println(getUnion(a,b));
    }

    private static Set<Integer> getCross(Set<Integer> one, Set<Integer> two){
        Set<Integer> result = new HashSet<>(one);
        result.retainAll(two);
        return result;
    }

    private static Set<Integer> getUnion(Set<Integer> one, Set<Integer> two){
        Set<Integer> result = new HashSet<>(one);
        result.addAll(two);
        return result;
    }

}
