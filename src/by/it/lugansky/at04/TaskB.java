package by.it.lugansky.at04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int people = scanner.nextInt();
            scanner.nextInt();

            // getting names for n people

            String[] names = new String[people];
            for (int i = 0; i < people; i++) {
                names[i] = scanner.nextLine();
            }


            // getting salary for each person for each quarter

            double[][] salary = new double[people][4];
            for (int i = 0; i < people; i++) {
                System.out.println("Введите зарплату для " + names[i]);
                double[] personSalary = InOut.getArray(scanner.nextLine());
                salary[i] = personSalary;
            }
        }
        // calc metrics


    }
