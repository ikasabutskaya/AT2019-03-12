package by.it.udalyou.at01_06;

/**
 * Created by user on 23.03.2019.
 */
 class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value=value;
                //Arrays.copyOf(value, value.length);
   }

    public String toString; {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
       for (int i=0;i<value.length;i++ ){
           sb=sb.append(delimiter).append(value[i]);
        // for (double elem : value) ;  {
           // sb.append(delimiter).append(elem);
            delimiter = ", ";
        }
        sb.append("}");
        String s = sb.toString();
        System.out.println(s);
       // return s;
        // strVector.replase("{","").replase("}","").split(",\\s*");
    }
}