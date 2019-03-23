package by.it.tsyhanova.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {

    public static void main(String[] args) {
        //Вывести через \n все предложения текста в порядке возрастания
        // количества символов (!) в каждом из них. В предложениях нужно
        // сначала заменить все небуквенные символы и их последовательности
        // на один пробел и выполнить trim() для каждого предложения.
        StringBuilder sb=new StringBuilder(Poem.text);

        Pattern pat0= Pattern.compile("[;:\\-\\,]");
        Matcher matcher0=pat0.matcher(sb);
        while (matcher0.find()) {
            int start = matcher0.start();
            sb.setCharAt(start, ' ');

            //sb.delete(start,start+1);
        }

        Pattern pat1 = Pattern.compile("(\\s){2,}");
        Matcher matcher1=pat1.matcher(sb);
        while (matcher1.find()) {
            int start = matcher1.start();
        }

        Pattern pattern = Pattern.compile("[\\.!?]+");
        String[] sent = pattern.split(sb);
        for(int i=0;i<sent.length;i++){
            for(int j=0;j<sent.length;j++){
                if(sent[i].length()<sent[j].length()){
                    String temp=sent[i];
                    sent[i]=sent[j];
                    sent[j]=temp;
                }
            }
        }
        for(String element:sent){
            System.out.println(element.trim()+'\n');
        }
    }
}
