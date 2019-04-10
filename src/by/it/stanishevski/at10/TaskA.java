package by.it.stanishevski.at10;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
        if (Math.random()>0.5)
            new HashMap<String, String>(null);
                else
                    Integer.parseInt("привет");
        }
        catch (Exception e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace){
//            System.out.println(element);}
                if (TaskA.class.getName().equals(element.getClassName())){
                    System.out.println(element);
                    String name =e.getClass().getName();
                    String clname= element.getClassName();
                    int number = element.getLineNumber();
                    System.out.printf(
                                    " name: %s\n" +
                                    "class: %s\n" +
                                    " line: %s\n",
                            name, clname,number);
                    break;
            } }}

    }
}
//name: java.lang.NullPointerException
//class: by.it.вашпакет.at10.TaskA
//        line: 8