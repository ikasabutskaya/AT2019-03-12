package by.it.ikasabutskaya.at07;

class Scalar extends Var {


    private double value;

    Scalar(double value) {
        this.value = value;
    }


    Scalar(Scalar scalar){
        this.value=scalar.value;
    }


    Scalar(String str){
        this.value=Double.parseDouble(str);
    }


    @Override
    public String toString() {
        return Double.toString(value);
    }

// сложение
    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            double sum=this.value+((Scalar) other).value;
            return new Scalar(sum);
        }
        else {
            return other.add(this);
        }
    }

// вычитание
    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar){
            double sub=this.value-((Scalar) other).value;
            return new Scalar(sub);
        }
        else {
            return new Scalar(-1).sub(other).add(this);
            // почему с .sub(other) и с .mul(other) одинакого верно отрабатывает?
        }
    }

// умножение
    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double mul=this.value*((Scalar) other).value;
            return new Scalar(mul);
        }
        else {
            return other.add(this);
        }
    }

// деление
    @Override
    public Var div(Var other) {
        if (other instanceof Scalar){
            double div=this.value/((Scalar) other).value;
            return new Scalar(div);
        }
        else {
            return super.div(other);
        }
    }

}

