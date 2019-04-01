package by.it.Simanovich.at08;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Parser parser = new Parser();
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            String expression = scanner.nextLine();
            if (expression.equals("end"))
                break;

            Var var = Var.createVar("1");
            System.out.println(var);
        }
    }
}
