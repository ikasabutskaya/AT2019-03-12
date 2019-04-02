package by.it.udalyou.at09;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

//TaskB1.Нужно ввести с консоли текст на английском языке до строки “end”(100
// и более слов).
    //Для каждого слова с помощью коллекций подсчитать частоту его встречаемости.
    //Вывести все различные слова в формате слово=частота.Слова,
    //отличающиеся регистром букв, считать различными. isn't или don’t –одно слово.

    public static void main(String[] args) {

        TaskB1 text = new TaskB1();

        List<String> list = new LinkedList<>();
        //StringBuilder sb=new StringBuilder(String.valueOf(new Scanner(System.in)));
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        String str;

        Scanner scan;
        scan = new Scanner(System.in);
        //scan.useDelimiter("[A-Za-z]+");

        Matcher matcher = pattern.matcher(scan.nextLine());

        while (matcher.find()) {
            if (!(str = scan.nextLine()).equals("end")) {
                list.add(str);
            }

            System.out.println(list);

            //  StringBuilder sb=new StringBuilder(Poem.text);
            //  Pattern pattern=Pattern.compile("[а-яА-ЯёЁ]{4,}");
            //  Matcher matcher=pattern.matcher(Poem.text);
            // while (matcher.find()){
            //    int start = matcher.start();
            //   sb.setCharAt(start+3,'#');
            // if (matcher.group().length()>=7){
            //   sb.setCharAt(start+6,'#');
            //}
            //System.out.println(sb);

        }
    }
}

