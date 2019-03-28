package by.it.okoyro.at04;

public class InOut {
	public static double[] getArray(String line) {
		String trim = line.trim();  //trim removes white spaces in the beginning and at the end
		String[] stringArray = trim.split(" "); // split string by white spaces
		double[] result = new double[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			result[i] = Double.parseDouble(stringArray[i]); // convert strings array to double array
		}
		return result;
	}

	public static void printArray(double[] array, String name, int column) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s[% -3d]=%-8.3f", name, i, array[i]);

			if ((i + 1) % column == 0) {  //(i+1) because array's lenght > element quantity
				System.out.println();
			}
		}
	}
}
