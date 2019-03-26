package by.it.okoyro.at06;

public class Runner {
	public static void main(String[] args) {
		Var var1 = new Scalar("111.456");
		System.out.println(var1);// firstly search for a method in Scalar class, then in Var, then in Object

		Var var2 = new Scalar(222); //объявление через абстрактный класс
		System.out.println(var2);

		Scalar var3 = new Scalar(333); //объявление через класс для получения экземпляра объекта Scalar, который передается в следующий конструктор
		System.out.println(var3);

		Var var4 = new Scalar(var3);
		System.out.println(var4);

		Var var5 = new Vector("{1.0, 2.0, 4.0}");
		System.out.println(var5);

		Var var6 = new Vector(new double[]{1.0, 2.0, 4.0});
		System.out.println(var6);

		Var var7 = new Vector(new Vector("{1.0, 2.0, 4.0}"));
		System.out.println(var7);
	}
}
