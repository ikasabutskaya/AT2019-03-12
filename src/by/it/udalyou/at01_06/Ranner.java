package by.it.udalyou.at01_06;

/**
 * Created by user on 23.03.2019.
 */
public class Ranner {
    public static void main(String[] arg) {

        Var var1 = new Scalar("111.458");
        System.out.println(var1);

        Var var2 = new Scalar(222);
        System.out.println(var2);

        Var var3 = new Scalar("3333.");
        System.out.println(var3);

        //Var var4=new Scalar("{1,2,3,4,5}");
        //System.out.println(var4);
        Var var5 = new Vector(new double[]{1, 2, 3, 4, 5});
        System.out.println(var5);
    }

}