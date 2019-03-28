package by.it.udalyou.at01_06;

import java.util.Arrays;

/**
 * Created by user on 23.03.2019.
 */
public class Vector1 extends Var {

    private double[] value;

    public Vector1(double[] value){
        this.value= Arrays.copyOf(value,value.length);


    }
    //public Vector(String strVector);    {
    // strVector.replase("{","").replase("}","").split(",\\s*");

    }

    //public Vector(Vector vector){}


