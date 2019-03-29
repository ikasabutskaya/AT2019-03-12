package by.it.romanova.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(Poem.text);

        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()){
            String word = matcher.group();
            if(stringMatch(matcher.group()))
                System.out.println(word);
        }

    }

    private static final String glas = "аоиеёэыуюя";
    private static final String soglas = "бвгджзйклмнпрстфхцчшщ";

    private static boolean stringMatch(String word){

        String first = Character.toString(word.charAt(0));
        String last = Character.toString(word.charAt(word.length()-1));

        return (soglas.contains(first) || soglas.toUpperCase().contains(first))
                && (glas.contains(last) || glas.toUpperCase().contains(last));
    }
}
