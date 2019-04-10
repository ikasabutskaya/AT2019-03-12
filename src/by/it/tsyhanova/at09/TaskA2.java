package by.it.tsyhanova.at09;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {

        //создание коллекции через конструктор методом Arrays.asList
        //это неполноцнггый List. Массив на интерфейсе
        List<Integer> integersA = Arrays.asList(1, 200000, 2, 2, 2, 2, 3, 4, 5, 6, 7, 70000);
        List<Integer> integersB = Arrays.asList(4, 5, 6, 7, 7, 7 , 7, 8, 9, 10);
        //реобразование массива в коллекцию
        HashSet<Integer> a=new HashSet<>(integersA);
        TreeSet<Integer> b=new TreeSet<>(integersB);
        System.out.println("A: "+a);
        System.out.println("B: "+b);

        Set<Integer> union = getUnion(a, b);
        System.out.println("Union: "+union);

        Set<Integer> cross = getCross(a, b);
        System.out.println("Cross: "+cross);
    }

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        //массив a скопировалось в конструктор хэшсета, а сам массив а никак не изменится
        Set<Integer> result=new HashSet<>(a);
        //объединяем коллекции
        result.addAll(b);
        return result;
    }
    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        //массив a скопировалось в конструктор хэшсета, а сам массив а никак не изменится
        Set<Integer> result=new HashSet<>(a);
        //получаем пересечение коллекций,т.е. те элементы, которые есть и в первой и второй коллекции
        result.retainAll(b);
        return result;
    }


}
