package by.it.romanova.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser{
    Var calc(String expression) throws CalcException {
        //2.0*2.0
        String[] operands = expression.split(Patterns.OPERATION);

        Var one = Var.createVar(operands[0]);
        Var two = Var.createVar(operands[1]);

        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcherOperation = patternOperation.matcher(expression);

        if(matcherOperation.find()){
            String operation = matcherOperation.group();
            switch (operation){
                case "+": return one.add(two);
                case "-": return one.sub(two);
                case "*": return one.mul(two);
                case "/": return one.div(two);
            }
        }
        return null;
    }
}
