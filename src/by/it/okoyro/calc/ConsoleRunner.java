package by.it.okoyro.calc;

import java.util.Scanner;

public class ConsoleRunner {
	public static void main(String[] args) {
		Parser parser = new Parser();
		Printer printer = new Printer();

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите операнды:");
		while (true) {
			String expression = sc.nextLine();
			if (expression.equals("end")) {  /* сравнение должно быть через equals потому что литерал нельзя сравнить со
			строкой, полученной в переменной expression */
				break;
			}
			try {
				Var var = parser.calc(expression);
				printer.print(var);
			}
			catch (CalcException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
