package by.it.tsyhanova.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskA1 {
    public static void main(String[] args){
        //В каждом слове текста 4-ю и 7-ю буквы заменить символом #.
        // Для слов короче 4 символов корректировку не выполнять.
        // Для слов короче 7 символов заменять только 4-ю букву.


        //создаем билдер для получения возможности изменять строку
        StringBuilder sb=new StringBuilder(Poem.text);
        //создаем паттерн регулярного выражения
        Pattern pattern= Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher=pattern.matcher(Poem.text);
        while (matcher.find()){
            int start=matcher.start();
            sb.setCharAt(start+3,'#');
            //matcher.group() возвращает найденную строку(слово)
            if(matcher.group().length()>=7){
                sb.setCharAt(start+6,'#');
            }
        }
        System.out.println(sb);
    }
}
