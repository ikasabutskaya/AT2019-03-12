package by.it.Simanovich.at08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    Var calc (String expression){

        String [] operands = expression.split(Patterns.Operation);
        Var one = Var.createVar(operands[0]);
        Var two = Var.createVar(operands[1]);
        Pattern patternOperation = Pattern.compile(Patterns.Operation);
        Matcher matcherOperation = patternOperation.matcher(expression);
        if (matcherOperation.find()){
            String operation = matcherOperation.group();
            switch (operation){
                case "+": return one.add(two);
                case "-": return one.sub(two);
                case "*": return one.mul(two);
                case "/": return one.div(two);
            }
        }
        return null;
       // return Var.createVar("0");
    }
}
