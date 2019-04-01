package by.it.okoyro.at08;

public abstract class Var implements Operation {

	static Var createVar(String operand) {
		operand = operand.trim().replace(" ", "");
		if (operand.matches(Patterns.SCALAR)) {
			return new Scalar(operand);
		}
		else if (operand.matches(Patterns.VECTOR)) {
			return new Vector(operand);
		}
		//		else if (strVar.matches(Patterns.MATRIX))
		//			return new Matrix(strVar);
		else
		//TODO create error
		{
			return null;
		}
	}

	@Override
	public String toString() {
		return "Это абстрактная переменная Var{}";
	}

	@Override
	public Var add(Var other) {
		System.out.println("Операция сложения " + this + "+" + other + " невозможна");
		return null;
	}

	@Override
	public Var sub(Var other) {
		System.out.println("Операция вычитания " + this + "-" + other + " невозможна");

		return null;
	}

	@Override
	public Var mul(Var other) {
		System.out.println("Операция умножения " + this + "*" + other + " невозможна");
		return null;
	}

	@Override
	public Var div(Var other) {
		System.out.println("Операция деления " + this + "/" + other + " невозможна");
		return null;
	}
}
