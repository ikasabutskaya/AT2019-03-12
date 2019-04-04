package by.it.agrinkevich.at10;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        }
        catch (NullPointerException | NumberFormatException e){
            printInfoException(e);
        }
    }

    private static void printInfoException(RuntimeException e) {
        String name = e.getClass().getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            int lineNummber = element.getLineNumber();
            String myClassName = element.getClassName();
            if (myClassName.equals(TaskA.class.getName())) {
                System.out.printf(" name: %s\n" +
                                  "class: %s\n" +
                                  " line: %d\n",
                        name, myClassName, lineNummber);
            }
        }
    }
}
