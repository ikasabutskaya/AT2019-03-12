package by.it.simanovich.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        String stih = Poem.text;
        StringBuilder sb = new StringBuilder(stih);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(stih);
        while (matcher.find()){
            int start = matcher.start();
            sb.setCharAt(start + 3, '#');
            if(matcher.group().length()>6) {
                sb.setCharAt(start + 6, '#');
            }
        }
        System.out.println(sb);

    }
}
