package by.it.tsyhanova.at09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        StringBuilder sb=new StringBuilder();
        //в цикле до заданного конечного слова "end" формируем StringBuilder из !!!многострочного текста методом append(str)
        while (!(str = scan.nextLine()).equals("end")) {
                sb.append(str);
        }
        //преобразовываем StringBuilder в строку методом toString()
        String s1 = sb.toString();
        //с помощью regex даляем из строки все небуквенные символы, кроме апострофа.
        // Дефис и тире записываем в начале либо в конце регулярного выражения
            s1 = s1.replaceAll("([-,.:;()?! /\\\"0-9\\t\\n\\r^\\s*$—])+", " ");
            //создаем map по типу HashMap
            Map<String, Integer> map = new HashMap<>();
            //в цикле разбиваем текст на слова с помощью split(" "), указав пробел в качестве разделителя
            for (String s : s1.split(" ")) {
                //если ключ для соответствующего слова уже существует, увеличиваем его на единицу где s - слово
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                }
                //если ключа у слова еще нет, даем ему значение единица
                else {
                    map.put(s, 1);
                }
            }
            //удаляем возможные элементы map, не имеющие ключа
            map.remove("");
            System.out.println(map);

    }
}
