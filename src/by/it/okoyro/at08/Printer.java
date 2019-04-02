package by.it.okoyro.at08;

public class Printer {
	void print(Var var){
		if (var != null) {
			System.out.println(var); /* метод принт выносим сюда, чтобы присменение могло быть более универсальным в
			main */
		}
	}

}
