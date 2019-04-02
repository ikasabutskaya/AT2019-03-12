package by.it.vshchur.at08;

import java.util.Scanner;

class ConsoleRunner {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line;

        Parser parser=new Parser();
        Printer printer=new Printer();
        while (!(line= scanner.nextLine()).equals("end")){
            Var result = parser.calc(line);
            printer.print(result);
        }
    }
}
