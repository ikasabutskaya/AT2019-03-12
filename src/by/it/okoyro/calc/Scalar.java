package by.it.okoyro.calc;

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
	public Var add(Var other) throws CalcException {  /* тип переменной, которая придет в метод, неизвестен
	поэтому надо проверить, является ли этот объект Scalar*/
		if (other instanceof Scalar) {
			double sum = this.value + ((Scalar) other).value;
			return new Scalar(sum); /* поскольку метод add возвращает Var other, а Var это
			абстрактный класс и его экземпляр вернуть невозможно, то должны вернуть экземпляр его потомка,
			 в данном случае Scalar*/
		}
		return other.add(this); /* в зависимости от типа объекта other (мы уже знаем, что не Scalar,
		если пришли в эту точку), метод add будет использован из Vector или из Matrix */
	}

	@Override
	public Var sub(Var other) throws CalcException {
		if (other instanceof Scalar) {
			double sub = this.value - ((Scalar) other).value;
			return new Scalar(sub);
		}
		return new Scalar(-1).mul(other).add(this); /* 3-{1,2,3} --> -1*{1,2,3}+5 потому что нельзя вычесть из
		Scalar Vector */
	}

	@Override
	public Var mul(Var other) throws CalcException {
		if (other instanceof Scalar) {
			double mul = this.value * ((Scalar) other).value;
			return new Scalar(mul);
		}
		return other.mul(this);
	}

	@Override
	public Var div(Var other) throws CalcException {
		if (other instanceof Scalar) {
			if (((Scalar)other).value==0)
				throw new CalcException("Невозможно делить на 0");
			double div = this.value / ((Scalar) other).value;
			return new Scalar(div);
		}
		return super.div(other);
	}
}
