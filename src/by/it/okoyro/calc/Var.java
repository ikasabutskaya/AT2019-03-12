package by.it.okoyro.calc;

public abstract class Var implements Operation {

	static Var createVar(String strVar) throws CalcException {
		strVar = strVar.trim().replace(" ", "");
		if (strVar.matches(Patterns.SCALAR))
			return new Scalar(strVar);

		if (strVar.matches(Patterns.VECTOR))
			return new Vector(strVar);

		//	if (strVar.matches(Patterns.MATRIX))     не реализовано
		//			return new Matrix(strVar);

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
