package by.it.agrinkevich.at10;

import java.util.*;

public class TaskC {
    private static Scanner scan;
    public static void main(String[] args) throws InterruptedException {
        TaskC.scan = new Scanner(System.in);
        readData();
    }
    static void readData() throws InterruptedException {
        List<Double> dubvalues = new ArrayList<>();
        int countErrors = 0;
        for(;;) {
            try {
                double value = scan.nextDouble();
                dubvalues.add(value);
                System.out.println(value);
            }
            catch (InputMismatchException e) {
                countErrors += 1;
                if (countErrors == 5)
                    throw new InputMismatchException();
                Thread.sleep(100);
                System.out.println("Введенное значение не является вещественным ");
                ListIterator li = dubvalues.listIterator(dubvalues.size());
                while (li.hasPrevious()) {
                    System.out.print(li.previous() + " ");
                }
                System.out.println();
            }
            scan.nextLine();
        }
    }
}
