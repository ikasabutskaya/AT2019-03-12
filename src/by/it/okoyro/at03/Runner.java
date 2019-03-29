package by.it.okoyro.at03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
	public static void main(String[] args) throws IOException {
		String line = readString();
		double[] array = InOut.getArray(line);
		InOut.printArray(array);
		InOut.printArray(array, "A", 4);
		double min = Helper.findMin(array);
		double max = Helper.findMax(array);
		System.out.println("\nmin value= " + min);
		System.out.println("max value= " + max);
		InOut.printArray(array); //print unsorted array
		Helper.sort(array);
	}

	private static String readString() throws IOException {
		System.out.println("введите элементы мвссива");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader.readLine();
	}
}
