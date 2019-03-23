package by.it.agrinkevich.at06;

public class Runner {
    public static void main(String[] args) {
        Var var = new Scalar("1111.3333");
        System.out.println(var);

        Var var2 = new Scalar(222);
        System.out.println(var2);

        Scalar var3 = new Scalar(3333);
        System.out.println(var3);

        Var var4 = new Vector("{1,2,3,4,5}");
        System.out.println(var4);

    }

}
