package by.it.okoyro.at02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
	public static void main(String[] args) {
		System.out.println("введите размерность матицы");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] mas = step1(n);

		//		int[][] arr = {
		//				{1, 2, 3, 4, 5, 6},
		//				{1, 9, 3, 4, 5, 6},
		//				{1, 9, 3, 4, 9, 6},
		//				{6, 5, 4, 3, 2, 1}
		//		};
		//		int[][] res = step3(arr);
		//		for (int[] row : res) {
		//			System.out.println(Arrays.toString(row));
		//		}
		//
		//		step3(arr);
	}

	private static int[][] step1(int n) {
		int[][] mas = new int[n][n];
		Random random = new Random();
		int min = -n;
		int max = n;

		boolean exit = false;
		while (!exit) {
			for (int i = 0; i < n || !exit; i++) {
				for (int j = 0; j < n || !exit; j++) {
					int number = random.nextInt(max + 1 - min) + min;
					mas[i][j] = number;
					exit = number == n || number == -n;
				}

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		return mas;
	}

	private static void step3(int[][] arr) {
		//search for max
		int max = Integer.MAX_VALUE;
		for (int[] row : arr) {
			for (int element : row) {
				if (element > max) {
					max = element;
				}
			}
		}
		//массивы с признаками уаления
		boolean[] delRow = new boolean[arr.length];
		boolean[] delCol = new boolean[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == max) {
					delRow[i] = true;
					delCol[j] = true;
				}
			}

		}
		int rowCount = 0;
		for (boolean del : delRow) if (!del) rowCount++;

		int colCount = 0;
		for (boolean del : delCol) if (!del) colCount++;

		//result
		int[][] res = new int[rowCount][colCount];
		int ires = 0;
		for (int i = 0; i < arr.length; i++) {
			if (delRow[i] == false) {
				int jres = 0;
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == max) {
						delRow[i] = true;

					}

				}
				//				res[ires][jres] = arr[i][j]
				//			}
				//		}
				//	}
				//}
			}
			//
		}
	}
}
