package by.it.simanovich.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        String vowels = "ёуеыаоэяиюЁУЕЫАОЭЯИЮ";
        String consonants = "йцкнгшщзхфвпрлджчсмтбЙЦКНГШЩЗХФВПРЛДЖЧСМТБ";
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()){
            String word = matcher.group();
            if (consonants.contains(word.substring(0,1)) && vowels.contains(word.substring(word.length() - 1))){
                System.out.println(word);
            }
        }
    }
}
