/*
package by.it.ikasabutskaya.at13;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {

        by.it.ikasabutskaya.calc_11.Parser parser=new by.it.ikasabutskaya.calc_11.Parser();
        Printer printer=new Printer();
        Scanner scanner=new Scanner(System.in);
        for(;;){
            String expression=scanner.nextLine();
            if (expression.equals("end"))
                break;
            Var var = null;
            try {
                var = parser.calc(expression);
            } catch (CalcException e) {
                System.out.println(" Ошибка в "+expression);
                System.out.println(e.getMessage());
            }
            printer.print(var);
        }
    }
}
*/
