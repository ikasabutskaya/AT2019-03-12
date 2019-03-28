package by.it.agrinkevich.at08;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Parser parser = new Parser();
        Printer printer = new Printer();
        Scanner scan = new Scanner(System.in);
        for (;;){
            String expression = scan.nextLine();
            if (expression.equals("end")) break;
            Var var = parser.calc(expression);
            printer.print(var);
        }
    }
}
