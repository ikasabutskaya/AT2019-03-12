package by.it.agrinkevich.at05;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words = {};
    private static int[] count = {};

    private static int pos(String word){
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            int p = pos(word);
            if( p >= 0){
                count[p]++;
            }
            else {
                int last = words.length;
                words = Arrays.copyOf(words, last+1);
                words[last] = word;
                count = Arrays.copyOf(count, last+1);
                count[last]=1;
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "=" +count[i]);
        }

    }
}

