package by.it.stanishevski.at07;

abstract class Var implements Operation{
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
