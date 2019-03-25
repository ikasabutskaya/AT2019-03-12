package by.it.okoyro.at06;

import java.util.Arrays;

public class Vector extends Var {
	private double[] value;

	public Vector(double[] value) {
		this.value = Arrays.copyOf(value, value.length); // required to create new array as a copy of existed
	}

	public Vector(String strVector) {
		String[] s = strVector.replace("{","").replace("}","").split(",\\s*");
		value=new double[s.length];
		for (int i = 0; i < s.length; i++) {
			  value[i]=Double.parseDouble(String.valueOf(value));
		}

				//{1, 2, 3, 4, 5}
	}

	public Vector(Vector vector) {
		this.value = Arrays.copyOf(vector.value, vector.value.length);
		}
}
