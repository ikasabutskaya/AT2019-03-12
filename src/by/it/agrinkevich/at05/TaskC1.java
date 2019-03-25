package by.it.agrinkevich.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        //String poem = new String(Poem.text);
         String[] sentences = {"один два       три четыре",
                              "пять,        шесть      семь     восемь,     девять",
                              "десять       одиннадцать двенадцать тринадцать",
                              "четырнадцать,       пятнадцать"};
        //String[] sentences = poem.split("\n");
        int maxLength = sentences[0].length();
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() > maxLength){
                maxLength = sentences[i].length();
            }
        }

        Pattern pattern = Pattern.compile("\\s");
        for (int i = 0; i < sentences.length; i++) {
            Matcher matcher = pattern.matcher(sentences[i]);
            while (matcher.find()){

            }
        }


    }
}