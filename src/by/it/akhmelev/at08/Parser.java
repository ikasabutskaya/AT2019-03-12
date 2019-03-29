package by.it.akhmelev.at08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression){
        //2.0*3.0
        String[] operands=expression.split(Patterns.OPERATION);
        Var one=Var.createVar(operands[0]);
        Var two=Var.createVar(operands[1]);
        Pattern pattern=Pattern.compile(Patterns.OPERATION);
        Matcher matcher=pattern.matcher(expression);
        if (matcher.find()){
            String operation=matcher.group();
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
