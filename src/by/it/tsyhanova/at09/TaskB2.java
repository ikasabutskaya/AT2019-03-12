package by.it.tsyhanova.at09;

import java.util.*;

public class TaskB2{
    public static void main(String[] args) {
        int n  = 6;
        List<String> arrList = new ArrayList<>();
        LinkedList<String> linkList = new LinkedList<>();
        fillList(n, arrList, linkList);
        System.out.println("ArrayList: "+arrList);
        System.out.println("LinkedList: "+linkList);
        System.out.println("Remove in ArrayList:");
        removeSecond(arrList);
        System.out.println("\nRemove in LinkedList:");
        removeSecond(linkList);
    }
    //заполняем ArrayList && LinkedList
    public static void fillList(int n, List arrList, LinkedList linkList) {
        Scanner scan=new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            String str=scan.next();
            arrList.add(str);
            linkList.addLast(str);
        }
    }
    //удаляем каждый второй элемент по кругу
    public static void removeSecond(List list) {
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while(list.size() > 1) {
            if(it.hasNext()) {
                it.next();
                count++;
                if(count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(list);
                }
            }
            else {
                it = list.iterator();
            }
        }
    }

}