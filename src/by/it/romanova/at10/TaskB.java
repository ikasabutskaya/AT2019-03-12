package by.it.romanova.at10;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        double sum = 0, value = 0, sqrt =0;
        try {
            Scanner sc = new Scanner(System.in);
            for (;;) {
                String txt = sc.nextLine();
                if (txt.equals("END"))
                    break;
                value = Double.parseDouble(txt);
                sum = sum + value;
                if (sum < 0)
                    throw new ArithmeticException();
                else {
                    sqrt = Math.sqrt(sum);
                    System.out.println(value + " " + sqrt);
                }

            }
        }
        catch (RuntimeException e){
            printIfRuntimeException(e);
        }

    }

    private static void printIfRuntimeException(RuntimeException e) {
        String name = e.getClass().getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            String myClassName = element.getClassName();
            int line = element.getLineNumber();
            if (myClassName.equals(TaskB.class.getName())){
                System.out.printf(" name: %s%n class: %s%n line: %d", name, myClassName, line);
            }

        }
    }
}
