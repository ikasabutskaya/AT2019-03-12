package by.it.shchur.at06;

public class Runner {
    public static void main(String[] args) {
        Var var=new Scalar(111.456);
        System.out.println(var);
        Var var2=new Scalar(222);
        System.out.println(var2);
        Scalar var3=new Scalar(3333);
        System.out.println(var3);
        Var var4=new Scalar(var3);
        System.out.println("{1,2,3,4,5.5}");
    }

}
