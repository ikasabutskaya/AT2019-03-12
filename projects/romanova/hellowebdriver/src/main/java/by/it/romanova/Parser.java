package by.it.romanova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser{

        private static final List<String> priority = new ArrayList<>(Arrays.asList("=,+,-,*,/".split(",")));
        private List<String> operation = new ArrayList<>();
        private List<String> operand;

        private int getPosOperation(){
            int level = -1, pos = -1, i = 0;
            for (String op : operation) {
                int currentLevel = priority.indexOf(op);
                if(level<currentLevel) {
                    level = currentLevel;
                    pos = i;
                }
                i++;
            }
            return pos;
        }



    public Var calc(String expression) throws CalcException {

        String[] operands = expression.split(Patterns.OPERATION);
        operand = new ArrayList<>(Arrays.asList(operands));

        Pattern p = Pattern.compile(Patterns.OPERATION);
        Matcher m = p.matcher(expression);
        while(m.find()){
            operation.add(m.group());
        }

        Var res = null;
        while (operation.size()>0){
            int pos = getPosOperation();
            String v1 = operand.get(pos);
            String op = operation.remove(pos);
            String v2 = operand.remove(pos+1);
            res = operationCalc(v1,op,v2);
            operand.set(pos,res.toString());

        }
        return res;
    }

    public String excludeBraces(String expression) throws CalcException {
            String res = expression, calculation;
            while ((res.contains("("))||(res.contains(")"))){
            Pattern p = Pattern.compile(Patterns.BRACES);
            Matcher m = p.matcher(res);
            while (m.find()){
                calculation = m.group().replace("(","").replace(")","");
                res = res.replace(m.group(),calc(calculation).toString());
            }

        }
        return res;
    }

    private Var operationCalc(String v1, String operation, String v2) throws CalcException {
        Var two = Var.createVar(v2);
        if (operation.equals("=")){
            return Var.saveVar(v1,two);
        }
        Var one = Var.createVar(v1);

        switch (operation){
            case "+": return one.add(two);
            case "-": return one.sub(two);
            case "*": return one.mul(two);
            case "/": return one.div(two);
        }

        return null;
    }
}
