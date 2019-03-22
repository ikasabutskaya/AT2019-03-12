package by.it.romanova.at05;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {

        String[] array = createSentenceArray(removeDots(Poem.text));

        sort(array);

        printArray(array);

    }

    private static void printArray(String[] mas) {
        for (String ma : mas) {
            System.out.println(ma);
        }
    }

    private static String removeDots(String text){
        return text.replaceAll("\\.\\.\\.", " ");
    }

    private static String[] createSentenceArray(String text){

        StringBuilder stringBuilder = new StringBuilder(text);
        Pattern sentence_pattern = Pattern.compile("([а-яА-ЯёЁ\\s-,!:\n]+)(\\.+)");


        Matcher matcher = sentence_pattern.matcher(stringBuilder);
        int i = 0;
        String[] mas = new String[0];
        while (matcher.find()){
            String sentence = matcher.group();
            String new_sentence = sentence.replaceAll("[^а-яА-ЯёЁ]+", " ");
            mas = Arrays.copyOf(mas,i+1);
            mas[i] = new_sentence.trim();
            i++;
        }

        return mas;

    }

    private static void sort(String[] mas){

        for (int j = 0; j < mas.length-1; j++) {
            for (int k = j+1; k < mas.length; k++) {
                if((mas[k].length())<(mas[j].length())){
                    String copy = mas[k];
                    mas[k]=mas[j];
                    mas[j] = copy;
                }
            }
        }

    }

}
