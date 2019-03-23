package by.it.romanova.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        String[] mas = arrayOfStrings(Poem.text);

        int max = maxStringLength(mas);

        for (String ma : mas) {
            int spaces = spacesCount(ma);
            StringBuilder stringBuilder = new StringBuilder(ma);
            System.out.println(ma + "   " + spaces);

            if(ma.length()<max)
            updateString(stringBuilder,spaces,max);
        }

        //printArray(mas);
    }

    private static String[] arrayOfStrings(String raw){

        return raw.split("\n");
    }

    private static void printArray(String[] array){
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static int spacesCount(String string){
        int space = 0;
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            space++;
        }
        return space;
    }

    private static int maxStringLength(String[] mas){
        int max = mas[0].length();
        for (String ma : mas) {
            if (ma.length() > max) {
                max = ma.length();
            }
        }

        return max;
    }

    private static void updateString(StringBuilder string, int spaces, int maxLength){
        int add = maxLength - string.length();
        int j = add/spaces;
        System.out.println(j);
        int k = add%spaces;
        System.out.println(k);
    }
}
