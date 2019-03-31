package by.it.Simanovich.at06;

public class Runner {

    public static void main(String[] args) {
        Var var1 = new Scalar("123.456");
        System.out.println(var1);

        Var var2 = new Scalar (222);
        System.out.println(var2);

        Scalar var3 = new Scalar (333);
        System.out.println(var3);

        Var var4 = new Scalar (var3);
        System.out.println(var4);
}
}
