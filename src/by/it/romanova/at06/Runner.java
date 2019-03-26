package by.it.romanova.at06;

public class Runner {

    public static void main(String[] args) {
        Var var1 = new Scalar("123.456");
        System.out.println(var1);

        Var var2 = new Scalar(new Scalar(3));
        System.out.println(var2);

        Var var3 = new Scalar(777.9);
        System.out.println(var3);

        double[] vector = {13.4,255.0,3.0,4.3,5.3};
        Var var4 = new Vector(vector);
        System.out.println(var4);

        Var var5 = new Vector(new Vector("{1,1,4.0}"));
        System.out.println(var5);

        Var var6 = new Vector("{1,2,3,4,5}");
        System.out.println(var6);

        double[][] a = {
                {1,2,3},
                {4,5,6},
                {5.6,8.0,66.1}
        };
        Var var7 = new Matrix(a);
        System.out.println(var7);

        Var var8 = new Matrix(new Matrix("{{1.1,0},{1.2,2.3}}"));
        System.out.println(var8);

        Var var9 = new Matrix("{{14.5,2.0},{3.11,4.555}}");
        System.out.println(var9);


    }

}
