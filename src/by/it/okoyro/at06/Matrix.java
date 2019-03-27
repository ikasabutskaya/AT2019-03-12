package by.it.okoyro.at06;

import java.util.Arrays;

public class Matrix {
	private double[][] value;

	public Matrix(double[][] value) {
		this.value = value;
	}

//	public Matrix(String strMatrix) {
//		String[][] s = strMatrix.replace("{", "")
//						.replace("}", "")
//						.split(",\\s*");
//				value = new double[s.length];
//				for (int i = 0; i < s.length; i++) {
//					value[i] = Double.parseDouble(s[i]);
//				}
//	}

	public Matrix(Matrix matrix) {
		this.value = Arrays.copyOf(matrix.value, matrix.value.length);
	}
}
