package by.it.okoyro.at07;

public class Scalar extends Var {
	private double value;

	public double getValue() {
		return value;
	}

	public Scalar(double value) {
		this.value = value;
	}

	public Scalar(String strScalar) {
		this.value = Double.parseDouble(strScalar);
	}

	public Scalar(Scalar scalar) {
		this.value = scalar.value;
	}

	@Override
	public String toString() {
		return Double.toString(value);
	}

	@Override
	public Var add(Var other) {  // тип переменной, которая придет в метод, неизвестен
		if (other instanceof Scalar) {  // поэтому надо проверить, является ли этот объект Scalar
			double sum = this.value + ((Scalar) other).value;
			return new Scalar(sum); /* поскольку метод add возвращает Var other, а Var это
			абстрактный класс и его экземпляр вернуть невозможно, то должны вернуть экземпляр его потомка,
			 в данном случае Scalar*/
		}
		return other.add(this); /* в зависимости от типа объекта other (мы уже знаем, что не Scalar,
		если пришли в эту точку), метод add будет использован из Vector или из Matrix */
	}

	@Override
	public Var sub(Var other) {
		if (other instanceof Scalar) {
			double sub = this.value - ((Scalar) other).value;
			return new Scalar(sub);
		}
		return new Scalar(-1).mul(other).add(this); /* 3-{1,2,3} --> -1*{1,2,3}+5 потому что нельзя вычесть из
		Scalar Vector */
	}

	@Override
	public Var mul(Var other) {
		if (other instanceof Scalar) {
			double mul = this.value * ((Scalar) other).value;
			return new Scalar(mul);
		}
		return other.mul(this);
	}

	@Override
	public Var div(Var other) {
		if (other instanceof Scalar) {
			double div = this.value / ((Scalar) other).value;
			return new Scalar(div);
		}
		return super.div(other);
	}
}
