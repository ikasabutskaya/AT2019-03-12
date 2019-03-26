package by.it.tsyhanova.at01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hello hello = new Hello();
        hello.printSlogan();
        hello.setSlogan("The world is amazing!");
        hello.printSlogan();
        Args argsObj = new Args(args);
        argsObj.printArgs();

        System.out.print("Input the number from 0 to 10 __");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("You put the even number " + num);
        } else {
            System.out.println("You put the odd number " + num);
        }
        System.out.println("You did it!!! The first homework is done!");
    }
}
