package by.it.okoyro.calc;

import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation {

	private static Map<String, Var> vars = new HashMap<>();

	static Var saveVar(String name, Var var) {
		vars.put(name, var);
		return var;
	}

	static Var createVar(String strVar) throws CalcException {
		strVar = strVar.trim().replace(" ", "");
		if (strVar.matches(Patterns.SCALAR)) {
			return new Scalar(strVar);
		}

		else if (strVar.matches(Patterns.VECTOR)) {
			return new Vector(strVar);
		}

		//	else if (strVar.matches(Patterns.MATRIX))     не реализовано
		//			return new Matrix(strVar);
		else if (vars.containsKey(strVar)) {
			return vars.get(strVar);
		}
		
		throw new CalcException("Невозможно создать " + strVar);
	}

	@Override
	public String toString() {
		return "Это абстрактная переменная Var{}";
	}

	@Override
	public Var add(Var other) throws CalcException {
		throw new CalcException("Операция сложения " + this + "+" + other + " невозможна");
		//		System.out.println("Операция сложения " + this + "+" + other + " невозможна");
	}

	@Override
	public Var sub(Var other) throws CalcException {
		throw new CalcException("Операция вычитания " + this + "-" + other + " невозможна");
		//		System.out.println("Операция вычитания " + this + "-" + other + " невозможна");
	}

	@Override
	public Var mul(Var other) throws CalcException {
		throw new CalcException("Операция умножения " + this + "*" + other + " невозможна");
		//		System.out.println("Операция умножения " + this + "*" + other + " невозможна");
	}

	@Override
	public Var div(Var other) throws CalcException {
		throw new CalcException("Операция деления " + this + "/" + other + " невозможна");
		//		System.out.println("Операция деления " + this + "/" + other + " невозможна");
	}
}
