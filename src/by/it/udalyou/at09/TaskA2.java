package by.it.udalyou.at09;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA2 {

    private static Set<Integer> getUnion(Set<Integer> one, Set<Integer> two){
       Set<Integer> resalt=new HashSet<>(one);
       resalt.addAll(two);
       return resalt;

    }

    private static Set<Integer> getCross(Set<Integer> one, Set<Integer> two){
        Set<Integer> resalt=new HashSet<>(one);
        resalt.retainAll(two);
        return resalt;

    }

    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>(Arrays.asList(1,2,3,4,4,4,5,5,6,6,6));
        HashSet<Integer> hashSet=new HashSet<>(Arrays.asList(9,8,7,4,4,4,5,5,0,6,6));
        System.out.println(getUnion(treeSet,hashSet));
        System.out.println(getCross(treeSet,hashSet));
    }

}
