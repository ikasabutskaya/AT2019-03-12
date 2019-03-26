package by.it.tsyhanova.at05;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    //TaskB1.Вывести в консоль все слова текста, начинающихся
    //согласной и заканчивающихся гласной буквой
    //(нужно сделать для проверки этого условия приватный метод без regex).
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher=p.matcher(Poem.text);
        while (matcher.find()){
            String word=matcher.group();
            if(check(word))
                System.out.println(word);
        }
    }
    //создадим строку гласных букв
    //на основании которой будем искать требуемые слова
    private static final String vow="уеэоаыяиюёУЕЭОАЫЯИЮЁ";
    //в этом методе согласно условия не используем регулярные выражения
    private static boolean check(String word) {
        //определяем, нашлась ли в начале строки согласная (если нет, в переменную first вернется false)
        boolean first=vow.indexOf(word.charAt(0))<0;
        boolean last=vow.indexOf(word.charAt(word.length()-1))>-1;
        return first && last;
    }
}
