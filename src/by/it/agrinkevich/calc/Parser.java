package by.it.agrinkevich.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) throws CalcException {
        //2.0*2.0

        if (expression.matches(Patterns.OPERATION_REGEXP)){
            String[] operands = expression.split(Patterns.OPERATION);
            Var two = Var.createVar(operands[1]);

            if (expression.contains("=")){
                return Var.saveVar(operands[0], two);
            }

            //String operation=matcherOperation.find() ? matcherOperation.group() : "error";

            Var one = Var.createVar(operands[0]);
            if (one==null || two==null){
                return null;
            }
            Pattern pattern = Pattern.compile(Patterns.OPERATION);
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()){
                String operation = matcher.group();
                switch (operation){
                    case "+": return one.add(two);
                    case "-": return one.sub(two);
                    case "*": return one.mul(two);
                    case "/": return one.div(two);
                }
            }
        }
        return null;
    }

}
