package by.it.gut.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]+");
            Matcher matcher = p.matcher(Poem.text);
            while (matcher.find()) {
                String word = matcher.group();
                if (check(word))
                    System.out.println(word);
            }
        }
        private static final String vow = "аАоОуУэЭыяЯёЁюЮеЕиИ";

        private static boolean check (String word){
            boolean first = vow.indexOf(word.charAt(0))<0;
            boolean last = vow.indexOf(word.charAt(word.length()-1))>-1;
            return first;
        }
    }












/*

    //получить текст
    StringBuilder sb = new StringBuilder(Poem.text);

    //создать и определить массив гласных букв
    private static String[] vowel = {"а", "А", "о", "О", "у", "У", "э", "Э", "ы", "я", "Я", "ё", "Ё", "ю", "Ю", "е", "Е", "и", "И"};

    //разбить входящий текст на массив слов
    private String[] split(" ")

    //сравнивать массив со словами и массив с гласными буквами
    //условие - если первый символ согласный, а последний гласный - записывать в массив и выводить на печать



    private static String[] words = {};
    Matcher matcher = pattern.matcher(Poem.text);
    private static boolean compare(String word){
        for (int i = 0; i < words.length; i++) {
            if words.s
        }
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[^аАоОуУэЭыяЯёЁюЮеЕиИ]+[аАоОуУэЭыяЯёЁюЮеЕиИ]+");
        Matcher matcher = pattern.matcher(Poem.text);


        for (String string : sb) {
            matcher = pattern.matcher(string);
            if (matcher.matches()) {
                System.out.println(string);
            }
        }
    }
}
*/
