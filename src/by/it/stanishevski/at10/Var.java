package by.it.stanishevski.at10;

//import by.it.stanishevski.at07.Operation;

abstract class Var implements Operation{


    static Var createVar (String operand) throws CalcExeption {
        operand=operand.trim().replace("\\s+","");
                if (operand.matches(Patterns.SKALAR))
                    return new Scalar(operand);
        //if (operand.matches(Patterns.VECTOR))
        //    return new Vector(operand);
        //if (operand.matches(Patterns.MATRIX))
        //    return new Matrix(operand);
        throw new CalcExeption("Невозможно создать"+operand);
    }



    @Override
    public Var add(Var other) throws CalcExeption {
        throw new CalcExeption ("операция сложения " + this+"+"+other+" невзможна");
            }

    @Override
    public Var sub(Var other) throws CalcExeption {
        throw new CalcExeption ("операция вычитания " + this+"-"+other+" невзможна");
    }

    @Override
    public Var mul(Var other) throws CalcExeption {
        throw new CalcExeption ("операция умножения " + this+"*"+other+" невзможна");
    }

    @Override
    public Var div(Var other) throws CalcExeption {
        throw new CalcExeption ("операция деления " + this+"/"+other+" невзможна");

    }


//    @Override
//    public String toString() {
//
//        return "Это класс Var ";
//    }
}
