package by.it.agrinkevich.at07;

public class Vector extends  Var {
   /* private double[] value;

    public Vector(double[] base) {
        this.value = Arrays.copyOf(base, base.length);
    }

    public Vector(String strVector) {
        String[] s = strVector.replace("{", "").replace("}", "").split(",\\s*");
        value = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            value[i] = Double.parseDouble(s[i]);
        }
    }

    public Vector(Vector vector) {
        this(vector.value);
        //this.value = Arrays.copyOf(vector.value, vector.value.length);
    }

    @Override
    public Var add(Var other){
        if (other instanceof Scalar){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Scalar)other).value;
            }
            return  new Vector(res);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(value).replace('[','{').replace(']', '}');
    }
    */
}
