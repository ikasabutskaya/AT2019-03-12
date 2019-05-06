package by.it.okoyro.calc;

public class Patterns {
	static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?"; // паттерн из regexp ("-?[0-9]+\\.[0-9]*?" from video)
	static final String VECTOR = "\\{((-?[0-9]+(\\.[0-9]+)?),?)+}"; // паттерн из regexp
	static final String MATRIX = ""; // паттерн из regexp
	static final String OPERATION = "[-=+*/]"; /*по этому паттерну найдутся все операции,
	минус должен быть первым обязательно, иначе - воспринимается как тире и полкчается петтерн от-да*/
}
