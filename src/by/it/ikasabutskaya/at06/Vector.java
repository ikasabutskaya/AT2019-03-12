package by.it.ikasabutskaya.at06;

class Vector extends Var{

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector vector) {
        this.value=vector.value;
    }

    Vector(String strVector) {
        String[] strVectorNew = strVector.substring(1, strVector.length()-1).split(",");
        this.value = new double[strVectorNew.length];
        for (int i = 0; i < value.length; i++) {
            this.value[i] = Double.parseDouble(strVectorNew[i].trim());
        }
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter=", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
