package by.it.okoyro.at10;

import java.util.Scanner;

public class TaskB {
	private static void printInfoException(RuntimeException e) {
		String name = e.getClass().getName();
		System.out.println(" name : %s" + name); // получили класс ошибки и его имя
		StackTraceElement[] stackTrace = e.getStackTrace(); // из stacktrace можно взять строку, в которой ошибка возникла
		for (StackTraceElement element : stackTrace) {
			String myClassName = element.getClassName();
			int lineNumber = element.getLineNumber();
			if (myClassName.equals(TaskB.class.getName())) {
				System.out.println(" name:");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String txt = sc.nextLine();
			if (txt.equals("End")) {
				break;
			}

			try {
				double value = Double.parseDouble(txt);
				System.out.println(value);
			}
			catch (NumberFormatException e) {
				printInfoException(e);
			}
		}
	}

}
