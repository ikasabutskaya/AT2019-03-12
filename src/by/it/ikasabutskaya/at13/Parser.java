/*
package by.it.ikasabutskaya.at13;

import by.it.ikasabutskaya.calc_11.CalcException;
import by.it.ikasabutskaya.calc_11.Patterns;
import by.it.ikasabutskaya.calc_11.Var;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Parser {
    Var calc(String expression) throws CalcException {

        String[] operands = expression.split(Patterns.OPERATION);
        Var two = Var.createVar(operands[1]);
        Pattern pattern = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = pattern.matcher(expression);

        String operation = matcher.find() ? matcher.group() : "error";
        if (operation.equals("=")) {
            String name = operands[0];
            Var.saveVar(name, two);
            return two;
        }

        Var one = Var.createVar(operands[0]);
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
        return null;
    }
    }

*/
