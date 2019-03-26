package by.it.tsyhanova.at05;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    //Определить, сколько раз повторяется в тексте каждое слово,
    // которое встречается в нем, используя массивы.
    // Вывести результаты на консоль в формате слово=повторы


    //чтобы приватные массивы были видны из статического метода, их тоже нужно сделать статическими
    //массивы создаются пустыми
    private static String[] w={};
    private static int[] count={};
    //метод определяем позицию слова в массиве
    private static int pos(String word){
        //если искомый элемент оказался словом, возвращаем его порядковый номер
        for (int i=0;i<w.length;i++){
            if(w[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher=pattern.matcher(Poem.text);
        while (matcher.find()) {
            //находим каждое конкретное слово с помощью матчера, который выделяет слово
            //с помощью group() без каких-либо дополнительных условий,
            //а только лишь с условием русских символов
            String word=matcher.group();
            int p=pos(word);
            //если p больше либо равно нулю, значит слово существует и
            //счетчик кол-ва раз его появления в тексте увеличивается
            //до тех пор, пока слово снова появляется в тексте
            if(p>=0){
                count[p]++;
            }
            else{
                //увеличим массивы на единицу
                int last=w.length;  //last element
                w= Arrays.copyOf(w,last+1);
                w[last]=word;       //запомним слово
                count= Arrays.copyOf(count,last+1);
                count[last]=1;      //укажем частоту повторений слова
            }
        }
        for(int i=0;i<w.length;i++){
            System.out.println(w[i]+'='+count[i]);
        }
    }

}
