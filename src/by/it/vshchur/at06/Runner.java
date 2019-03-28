package by.it.vshchur.at06;

public class Runner {
    public static void main(String[] args) {
        AbstractVar v1 = new Scalar(3.14);
        AbstractVar v2 = new Vector(new double[] {1,2,3});
        AbstractVar v3 = new Matrix(new double[][] {{1,2},{3,4}});
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
//        Scalar var3 = new Scalar(3333);
//        System.out.println(var3);
//        AbstractVar abstractVar4 = new Scalar(var3);
//        System.out.println("{1,2,3,4,5.5}");
    }

}
