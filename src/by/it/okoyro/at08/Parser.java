package by.it.okoyro.at08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
	Var calc(String expression) {
		//2.0*3.0 например выражение
		String[] operands = expression.split(Patterns.OPERATION); /*строку, которая пришла из консоли,
		разбиваем на массив строк используя паттерн*/
		Var one = Var.createVar(operands[0]); /*в процессе вычисления учасивуют 2 опреанда, для них переменные*/
		Var two = Var.createVar(operands[1]);
		if (one == null || two == null) {
			return null; //TODO create error
		}
		Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
		Matcher matcherOperation = patternOperation.matcher(expression);
		if (matcherOperation.find()) {
			String operation = matcherOperation.group(); // сейчас здесь лежит 
			switch (operation) {
				case "+":
					return one.add(two);
				case "-":
					return one.sub(two);
				case "*":
					return one.mul(two);
				case "/":
					return one.div(two);
			}
		}
		return null;
	}
}
