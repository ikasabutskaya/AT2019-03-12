package by.it.okoyro.at06;

import java.util.Arrays;

public class Vector extends Var {
	private double[] value;

	public Vector(double[] value) {
		this.value = Arrays.copyOf(value, value.length); // required to create new array as a copy of existed
	}

	public Vector(String strVector) {
		String[] s = strVector.replace("{", "")
				.replace("}", "")
				.split(",\\s*"); //сплитим строку и получаем массив строк
		value = new double[s.length]; // создаем массив для double
		for (int i = 0; i < s.length; i++) {
			value[i] = Double.parseDouble(s[i]); //перебираем массив строк и заполняем массив double
		}
	}

	public Vector(Vector vector) {
		this.value = Arrays.copyOf(vector.value, vector.value.length);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < value.length; i++) {
			sb.append(value[i]);
			if (i < value.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
	}
}
