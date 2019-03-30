package by.it.romanova.at08;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {

        Parser parser = new Parser();
        Printer printer = new Printer();
        Scanner sc = new Scanner(System.in);
        for(;;){
            String expression = sc.nextLine();
            if(expression.equals("end"))
                break;
            Var var = parser.calc(expression);
            printer.print(var);
        }

    }
}