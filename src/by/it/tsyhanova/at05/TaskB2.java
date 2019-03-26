package by.it.tsyhanova.at05;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB2 {

    public static void main(String[] args) {
        //Вывести через \n все предложения текста в порядке возрастания
        // количества символов (!) в каждом из них. В предложениях нужно
        // сначала заменить все небуквенные символы и их последовательности
        // на один пробел и выполнить trim() для каждого предложения.

        //разделяем текст на предложения, используя знаки окончания приедложения
        //с помощью метода replace заменяем многоточие на пробел
        String[] sentences=Poem.text.replace("..."," ").split("[.?!]");
        for (int i = 0; i <sentences.length ; i++) {
            //[^а-яА-ЯёЁ]+ все символы, кроме буквенных
            //методом replaceAll заменяем все небуквенные символы на пробел
            // обрезаем пробел в начале и конце строки методом trim
            sentences[i]=sentences[i].replaceAll("[^а-яА-ЯёЁ]+"," ").trim();
        }
        //Сортировка массива строк с помощью компаратора
        for (int i = 0; i <sentences.length ; i++) {
            for (int j = 0; j <sentences.length ; j++){
                if(sentences[i].length()<sentences[j].length()){
                    String str=sentences[i];
                    sentences[i]=sentences[j];
                    sentences[j]=str;
                }
            }
        }
        for(String element:sentences){
            System.out.println(element);
        }
    }
}
