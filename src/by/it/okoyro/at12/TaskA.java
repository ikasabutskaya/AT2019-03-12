package by.it.okoyro.at12;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskA {
	public static void main(String[] args) {

		String filename = System.getProperty("user.dir") + "/src/by/it/okoyro/at12/matrix.txt";  // TO DO expand path

		int[][] array = new int[6][4];

		while (!generate(array)) ; //метод с true/false return заполняет матрицу случайными числами

		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			for (int[] row : array) {
				for (int element : row) {
					System.out.printf("%3d ", element); // incorrect
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean generate(int[][] array) {
		boolean minus15 = false;
		boolean plus15 = false;

		for (int i = 0; i < array[i].length; i++) {
			for (int j = 0; j < array[j].length; j++) { //??? почему указываем [j] ???
				array[i][j] = (int) (Math.random() * 31) - 15;
				if (!minus15 && array[i][j] == -15) {
					minus15 = true;
				}
				if (!plus15 && array[i][j] == -15) {
					plus15 = true;
				}
			}
		}
		return minus15 && plus15;
	}
}
