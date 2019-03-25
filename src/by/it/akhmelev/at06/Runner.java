package by.it.akhmelev.at06;

public class Runner {
    public static void main(String[] args) {
        Var var1=new Scalar("111.456");
        System.out.println(var1);

        Var var2=new Scalar(222);
        System.out.println(var2);

        Var var3=new Scalar(3333);
        System.out.println(var3);

        Var var4=new Vector("{1,2,3,4,5.5}");
        System.out.println(var4);
    }
}
