package by.it.okoyro.at12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskA {
	public static void main(String[] args) {

		String filename = System.getProperty("user.dir") + "/src/by/it/okoyro/at12/matrix.txt";

		int[][] array = new int[6][4];

		while (!generate(array)) ; //метод с true/false return-ом заполняет матрицу случайными числами

		printMatrixToFile(filename, array);
		readMatrixFromFile(filename);
	}

	private static boolean generate(int[][] array) {
		boolean minus15 = false;
		boolean plus15 = false;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[j].length; j++) { //??? почему указываем [j] и не указваем [i] ???
				array[i][j] = (int) (Math.random() * 31) - 15;
				if (!minus15 && array[i][j] == -15) {
					minus15 = true;
				}
				if (!plus15 && array[i][j] == 15) {
					plus15 = true;
				}
			}
		}
		return minus15 && plus15; // boolean method why return???
	}

	private static void printMatrixToFile(String filename, int[][] array) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			for (int[] row : array) {
				for (int element : row) {
					pw.printf("%3d ", element);
				}
				pw.println();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readMatrixFromFile(String filename) {
		try (BufferedReader br = new BufferedReader(
				new FileReader(filename)
		)) {
			while (true) {
				String line = br.readLine();
				if (line==null) break;
				System.out.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
