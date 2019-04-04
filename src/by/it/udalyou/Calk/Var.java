package by.it.udalyou.Calk;



abstract class Var implements Operation {

    static Var createVar(String operand)throws CalkException{
        operand=operand.trim().replace("\\s+","");
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if (operand.matches(Patterns.MATRIX))
          //  return new Matrix(operand);
        return null;//когда вставлю вектор и матрицу - убрать
        throw  new CalkException("Невозможно создать "+operand);
    }

    @Override
    public Var add(Var other) throws CalkException{
       throw new CalkException("Операция сложения "+this+"+"+other+" не возможна");

    }

    @Override
    public Var sub(Var other)throws CalkException {
        throw new CalkException("Операция вычитания "+this+"-"+other+" не возможна");

    }

    @Override
    public Var mul(Var other) throws CalkException{
        throw new CalkException("Операция умножения "+this+"*"+other+" не возможна");
            }

    @Override
    public Var div(Var other)throws CalkException {
        throw new CalkException("Операция деления "+this+"/"+other+" не возможна");
            }
}
