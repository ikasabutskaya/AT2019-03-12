package by.it.udalyou.at10;

import java.util.Scanner;

public class TaskB {

// *   считывает данные из консоли построчно и закрывается при вводе в
//    консоль слова END;
//* переводит каждую строку в вещественное число и выводит в консоль данное
//  число и корень из суммы всех ранее введенных чисел, включая введенное;
//* если перевести ввод в число невозможно, то программа перехватывает
// полученную ошибку и показывает сообщение в консоли сообщение, такого же
// формата, как в предыдущем задании
//* если невозможно извлечь корень, то обработка аналогична,
// но тип ошибки -ArithmeticException

    private static void printInfoExeption(RuntimeException e) {
        String name = e.getClass().getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            String clname = element.getClassName();
            int nam = element.getLineNumber();
            if (clname.equals(element.getClassName())) {
                //          System.out.println(element);


                if (clname.equals(TaskB.class.getName())) {
                    System.out.printf(
                            " name: %s\n" +
                                    "class: %s\n" +
                                    " line: %s\n",
                            name, clname, nam);
                }
            }
        }
    }


    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String txt = scanner.nextLine();
            if (txt.equals("END"))
                break;

            try {
                double value = Double.parseDouble(txt);

                System.out.println(value);

                sum = sum + value;
                try {
                    if (sum >= 0) {
                        double squ = Math.sqrt(sum);
                        System.out.println("Корень суммы, введенных чисел: " + squ);
                    } else throw new ArithmeticException();

                } catch (ArithmeticException e) {
                    printInfoExeption(e);
                }

            }catch (NumberFormatException e) {
                printInfoExeption(e);
            }
        }

    }
}