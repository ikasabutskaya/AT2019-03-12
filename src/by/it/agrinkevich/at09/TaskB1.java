package by.it.agrinkevich.at09;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> wordCounting = new HashMap();
        for (;;){
            String str = scan.nextLine();
            List<String> result = splitStringToWordsList(str);
            if (str.equals("end")) break;
            for (String word : result) {
                Integer count = wordCounting.get(word);
                if (Objects.isNull(count)) {
                    wordCounting.put(word, 1);
                } else {
                    wordCounting.put(word, count + 1);
                }
            }
        }
        System.out.println(wordCounting);
    }

    private static List<String> splitStringToWordsList(String str) {
        Pattern pattern = Pattern.compile("([A-Za-z']+)");
        Matcher matcher = pattern.matcher(str);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }
}
