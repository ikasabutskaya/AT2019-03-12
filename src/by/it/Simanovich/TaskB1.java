package by.it.Simanovich;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        String poem = new String(Poem.text);
        //words = (String[]) toString().split("[\\s,.:!?]+");
        String [] words = poem.split("[\\s,.:!?]+");
        Pattern pattern = Pattern.compile("^[йцкнгшщзхъфвпрлджчсмтьб].*[уеыаоэяию]$");
        for (int i = 0; i < words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);
            if (matcher.find()){
                System.out.println(words[i]);
            }



        }
    }
}
