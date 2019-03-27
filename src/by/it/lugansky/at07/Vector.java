package by.it.lugansky.at07;

class Vector extends Var {


    private double[] value;

    Vector(double[] value) {

        this.value = value;
    }

    public Vector() {

    }

//    public Vector() {
//        String[] s = strVector.replace("{","").replace("}","").split(",\\s*");
//        //1,2,3,4,5.0
//        value=new double[s.length];
//        for (int i = 0; i < s.length; i++) {
//            value[i]=Double.parseDouble(s[i]);
//            }
//
//
//    }

//    public Vector() {
//        this.value=Arrays.copyOf(vector.value,vector.value.length);
//    }
}
