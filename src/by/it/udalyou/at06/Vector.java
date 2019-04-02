package by.it.udalyou.at06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 23.03.2019.
 */
 class Vector extends Var {

    public double[] value;

    public Vector(double[] val) {
        int k=val.length;
        this.value=new double[k];
                System.arraycopy(val,0,this.value,0,k);
   }

   public Vector(Vector vector){
        int k=vector.value.length;
        this.value=new double[k];
        System.arraycopy(vector.value,0,this.value,0,k);
   }
    public  Vector(String strVector){

        this.value=new double[3];
    Pattern pat = Pattern.compile("[1-9\\.]+");
    Matcher matcher=pat.matcher(strVector);
    int i=0;
    while (matcher.find()){
        this.value[i]=Double.parseDouble(matcher.group());
        i++;
    }

}
    public String toString() {
        String s = "{";

       for (int i=0;i<this.value.length-1;i++ ){
           s=s+value[i]+", ";

        }
        s=s+this.value[this.value.length-1]+"}";

        return s;
        // strVector.replase("{","").replase("}","").split(",\\s*");
    }
}