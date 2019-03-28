package by.it.lugansky.at03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Runner {

        public static void main(String[] args)  {
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
            double [ ] array = InOut.getArray(str);
            InOut.printArray(array);
            InOut.printArray(array,"V",3);

        }


    }

