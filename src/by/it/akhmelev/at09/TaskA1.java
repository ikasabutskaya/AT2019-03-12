package by.it.akhmelev.at09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskA1 {

    private List<Integer> grades =new ArrayList<>();

    public static void main(String[] args) {
        TaskA1 instance=new TaskA1();
        for (int i = 0; i < 20; i++) {
            int grade=(int)(Math.random()*10)+1;
            instance.grades.add(grade);
        }
        System.out.println("Before:"+instance.grades);
        instance.clearBad(instance.grades);
        System.out.println("After:"+instance.grades);
    }

    private void clearBad(List<Integer> grades) {
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()){
            Integer grade = iterator.next();
            if (grade<4)
                iterator.remove();
        }

    }
}
