package by.it.romanova.at09;

import java.util.*;

public class TaskB1 {

    public static void main(String[] args) {

        ArrayList<String> text = enteredText();
        HashSet<String> set = uniqueWords(text);
        HashMap<String,Integer> result = wordsFrequency(text,set);

        System.out.println(result);

    }

    private static ArrayList<String> enteredText(){
        ArrayList<String> collection = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String str;
        while(!(str = sc.next()).equals("end")){
            collection.add(str.replaceAll("[^\\w'-]",""));
        }

        return collection;
    }

    private static HashSet<String> uniqueWords(Collection<String> collection){
        return new HashSet<>(collection);
    }

    private static HashMap<String,Integer> wordsFrequency(Collection<String> text, Collection<String> words){
        HashMap<String,Integer> result = new HashMap<>();

        for (Object word : words) {
            String key = word.toString();
            int count = Collections.frequency(text, word);
            result.put(key, count);
        }

        return result;

    }

}
