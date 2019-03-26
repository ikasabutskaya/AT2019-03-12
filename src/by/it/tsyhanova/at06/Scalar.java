package by.it.tsyhanova.at06;

class Scalar extends Var{

    //На уровень Aразработайте для класса Varнаследника Scalar с тремя конструкторами:
    //1.Из вещественного числа 3.1415сигнатура конструктора Scalar(double value)
    //2.Из такой же точно переменнойсигнатура конструктора Scalar(Scalar scalar)
    //3.Из строки вида 3.1415сигнатура конструктора Scalar(String strScalar)
    //Переопределите метод String toString()так, чтобы он возвращал строку вида 3.1415

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String str) {
        this.value = Double.parseDouble(str);
    }

    Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
