package by.it.stanishevski.at10;

import java.util.Scanner;

public class ConsoleRunner  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;

        Parser parser = new Parser();
        Printer printer = new Printer();

        while ( !( line = scan.nextLine()).equals("end")){
                    try {
                Var result = parser.calc(line);
                printer.print(result);
            } catch (CalcExeption calcExeption) {
                        System.out.println(calcExeption.getMessage());
            }

        }
    }
  }

