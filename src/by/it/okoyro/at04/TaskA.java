package by.it.okoyro.at04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
	public static void main(String[] args) {
		printMulTable();
		System.out.println("введите строку с числами через пробел");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		buildOneDimArray(line);
	}

	static void printMulTable() {
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%1d*%1d=%-2d ", i, j, i * j);
			}
			System.out.println();
		}
	}

	static void buildOneDimArray(String line) {
		double[] array = InOut.getArray(line);
		InOut.printArray(array, "V", 5);
		System.out.println("печать несортированного массива закончена");
		double first = array[0];     //запомнили значение первого по индексу элемента
		double last = array[array.length - 1]; ////запомнили значение последнего по индексу элемента
		Helper.sort(array);
		InOut.printArray(array, "V", 4);

		//перебор всех элементов наивный
		for (int i = 0; i < array.length; i++) {
			if (first == array[i]) {
				System.out.println("\nIndex of first element=" + i);
				break;
			}
		}
			//перебор элементов с использованием метода класса Array
			int indexLast = Arrays.binarySearch(array, last);
			System.out.println("Index of last element=" + indexLast);
	}
}
