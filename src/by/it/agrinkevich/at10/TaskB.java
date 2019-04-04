package by.it.agrinkevich.at10;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sumSqrt = 0;
        double sum = 0;
        for (;;) {
            String txt = scan.nextLine();
            if (txt.equals("END")) {
                break;
            }
            try {
                double value = Double.parseDouble(txt);
                System.out.println(value);
                sum += value;
                sumSqrt = Math.sqrt(sum);
                if (Double.isNaN(sumSqrt))
                    throw new ArithmeticException();
                System.out.println(sumSqrt);
            }
            catch (NumberFormatException | ArithmeticException e){
                printInfoException(e);
            }
        }
    }

    private static void printInfoException(RuntimeException e) {
        String name = e.getClass().getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            int lineNummber = element.getLineNumber();
            String myClassName = element.getClassName();
            if (myClassName.equals(TaskB.class.getName())) {
                System.out.printf(" name: %s\n" +
                                  "class: %s\n" +
                                  " line: %d\n",
                        name, myClassName, lineNummber);
            }
        }
    }
}
