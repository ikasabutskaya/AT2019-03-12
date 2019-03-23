package by.it.okoyro.at04;

public class Helper {

	public static void sort(double[] array) {
		boolean shift;
		int last = array.length - 1;
		do {
			shift = false;
			for (int i = 0; i < last; i++) {
				if (array[i] > array[i + 1]) {
					double buffer = array[i];
					array[i] = array[i + 1];
					array[i + 1] = buffer;
					shift = true;
				}
			}
			last--;  // при каждой итерации цикла один элемент становится на место и длину проверяемого массива можно уменьшить на 1
		}
		while (shift);
	}
}

