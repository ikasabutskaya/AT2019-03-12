package by.it.okoyro.at07;

public abstract class Var implements Operation {

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
