package by.it.udalyou.at08;

import by.it.udalyou.Calk.CalkException;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) throws CalkException {
        Scanner scan=new Scanner(System.in);
        String line;

        Parser parser=new Parser();
        Printer printer=new Printer();

        while (!(line=scan.nextLine()).equals("end")){
            Var resalt=parser.calk(line);
            printer.print(resalt);
        }

        }
}
