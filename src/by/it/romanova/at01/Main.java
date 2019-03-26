package by.it.romanova.at01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hello hello=new Hello();
        hello.printSlogan();
        hello.setSlogan("Romamova");
        hello.printSlogan();

        Args argObject=new Args(args);
        argObject.printArgs();
    }

}
