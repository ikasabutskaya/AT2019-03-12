package by.it.ikasabutskaya.at06;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Var v1=new Scalar(3.1415);
        Var v2=new Scalar(new Scalar(3.1415));
        Var v3=new Scalar("3.1415");

        double[] arr = {1.0, 2.0, 4.0};
        Var v4=new Vector(arr);
        Var v5=new Vector(new Vector(arr));
        Var v6=new Vector("{1.0, 2.0, 4.0}");

        double[][] arr2 = {{1.0, 2.0}, {3.0, 4.0}};
        Var v7=new Matrix(arr2);
        Var v8=new Matrix(new Matrix(arr2));
        Var v9=new Matrix("{{1.0,2.0},{3.0,4.0}}");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);
        System.out.println(v9);
    }


}
