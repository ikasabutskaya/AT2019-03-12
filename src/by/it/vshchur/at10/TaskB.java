package by.it.vshchur.at10;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfAllEnteredvalues = 0;
        while (true) {
            String txt = scanner.nextLine();
            if (txt.equals("END"))
                break;
            try {
                double value = Double.parseDouble(txt);
                System.out.println(value);
                sumOfAllEnteredvalues += value;
                if (value < 0) throw new ArithmeticException();

                System.out.println(Math.sqrt(sumOfAllEnteredvalues));
            } catch (NumberFormatException | ArithmeticException e) {
                printInfoException(e);
            }
        }
    }

    private static void printInfoException(RuntimeException e) {
        String name = e.getClass().getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            String myClassName = element.getClassName();
            int lineNumber = element.getLineNumber();
            if (myClassName.equals(TaskB.class.getName())) {
                System.out.printf("" +
                                " name: %s\n" +
                                "class: %s\n" +
                                " line: %d\n",
                        name, myClassName, lineNumber
                );
            }
        }
    }
}