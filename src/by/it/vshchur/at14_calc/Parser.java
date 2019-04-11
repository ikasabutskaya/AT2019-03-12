package by.it.vshchur.at14_calc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    private Map<String,Integer> priority = new HashMap<>();

    public Parser(){
        priority = new HashMap<>();
        priority.put("=",0);
        priority.put("+",1);
        priority.put("-",1);
        priority.put("*",2);
        priority.put("/",2);

    }

    private int getIndex (List<String> operations){
        int currentPriority=-1;
        int index=-1;
        for (int i = 0; i < operations.size(); i++){
            String op = operations.get(i);

        }

        return 0;
    }

    private Var oneOperation (String operand1, String operation, String operand2) {
        //более коротко:
        Var two = Var.createVar(operand2);

        if (operation.equals("=")) {
            String name = operand1;
            Var.saveVar(name, two);
            return two;
        }
        Var one = Var.createVar(operand1);
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


    Var calc(String expression) throws CalcException {
        //2.0*3.0
        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(expression);
        String[] operands=expression.split(Patterns.OPERATION); //A=9
        List<String> operations= new ArrayList<>();
        while (matcher.find())
            operations.add(matcher.group());
        String [] parts = expression.split(Patterns.OPERATION);
        List <String> tmp = Arrays.asList(parts);
        List <String> operands = new ArrayList<>(tmp);
        while (!operands.isEmpty()) {
            int index = getIndex(operations);
            String operand1 = operands.remove(index);
            String operand2 = operands.remove(index);
            String operand = operands.remove(index);
            Var result = oneOperation(operand1, operations,  operand2);
            operands

        }

        return null;
    }
}
