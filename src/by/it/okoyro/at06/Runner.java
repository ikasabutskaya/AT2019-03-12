package by.it.okoyro.at06;

public class Runner {
	public static void main(String[] args) {
		Var var1 = new Scalar("111.456");
		System.out.println(var1);// firstly search for a method in Scalar class, then in Var, then in Object

		Var var2 = new Scalar(222); //объявление через абстрактный класс
		System.out.println(var2);

		Scalar var3 = new Scalar(333); //объявление через класс
		System.out.println(var3);

		Var var4 = new Scalar(var3);
		System.out.println(var4);
	}
}
