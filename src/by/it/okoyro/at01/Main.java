package by.it.okoyro.at01;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Hello myFirstClass = new Hello();
		myFirstClass.printSlogan();
		myFirstClass.setSlogan("Привет, Мир!!!");
		myFirstClass.printSlogan();
		Args argOdj = new Args(args);
		argOdj.printArgs();
	}
}
