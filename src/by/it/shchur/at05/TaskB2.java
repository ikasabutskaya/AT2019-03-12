package by.it.shchur.at05;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB2 {
    public static void main(String[] args) {
       // System.out.print(Poem.text);
        String[] sentences = Poem.text.split("[.?!][^?=.{3,}]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i]=sentences[i].replaceAll("[,\\n]", " ").trim();
        }

        Comparator<String> comparator=new Comparator<String>(){
            @Override
            public int compare (String o1, String o2){
                return o1.length()-o2.length();
            }
        };
        Arrays.sort(sentences, comparator);
        for (String sentens:sentences){
            System.out.println(sentens);
        }
    }

}