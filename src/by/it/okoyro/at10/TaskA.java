package by.it.okoyro.at10;

import java.util.HashMap;

public class TaskA {
	public static void main(String[] args) {
		try {
			if (Math.random() > 0.5) {
				new HashMap<String, String>(null);
			}
			else {
				Integer.parseInt("привет");
			}
		}
		catch (NullPointerException | NumberFormatException e) {
			printInfoException(e);
		}
	}

	private static void printInfoException(RuntimeException e) {
		StackTraceElement[] stackTrace = e.getStackTrace(); // из stacktrace можно взять строку, в которой ошибка возникла
		for (StackTraceElement element : stackTrace) { // цикл для всех элементов массива, т.е. перебор всех строк stacktrace
			if (element.getClassName().equals(TaskA.class.getName())) { //сравниваем имя класса в массиве с именем класса TaskA
				String name = e.getClass().getName(); // получили класс ошибки и его имя
				String clname = element.getClassName(); // получили имя класса, в котором ошибка возникла
				int lineNumber = element.getLineNumber(); // получили номер строки, в которой возникла ошибка
				System.out.printf(
						" name: %s\n" +
						"class: %s\n" +
						" line: %d\n", name, clname, lineNumber);
				break;
			}
		}
	}
}
