package by.it.stanishevski.at08;

//import by.it.stanishevski.at07.Operation;

abstract class Var implements Operation{


    static Var createVar (String operand){
        operand=operand.trim().replace("\\s+","");
                if (operand.matches(Patterns.SKALAR))
                    return new Scalar(operand);
        //if (operand.matches(Patterns.VECTOR))
        //    return new Vector(operand);
        //if (operand.matches(Patterns.MATRIX))
        //    return new Matrix(operand);
        return null;
    }



    @Override
    public Var add(Var other) {
        System.out.println("операция сложения " + this+"+"+other+" невзможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("операция вычитания " + this+"-"+other+" невзможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("операция умножения " + this+"*"+other+" невзможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("операция деления " + this+"/"+other+" невзможна");
        return null;
    }


//    @Override
//    public String toString() {
//
//        return "Это класс Var ";
//    }
}
