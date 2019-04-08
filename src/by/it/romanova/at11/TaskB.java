package by.it.romanova.at11;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TaskB {

    public static void main(String[] args) {

        String sourcePath = System.getProperty("user.dir") + "/src/by/it/romanova/at11/TaskB.txt";
        String outPath = System.getProperty("user.dir") + "/src/by/it/romanova/at11/resultTaskB.txt";

        ArrayList<String> arr = extractArrayOfLines(sourcePath);

        int wordsCount = getWordsCount(arr);
        int punct = getPunct(arr);

        String result = "words=" + wordsCount + ", " + "punctuation marks=" + punct;

        System.out.println(result);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath))) {
            bufferedWriter.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(arr);

    }

    private static int getPunct(ArrayList<String> arr) {
        int punct = 0;
        for (String line : arr) {
            Pattern punctiationPattern = Pattern.compile("[^а-яА-ЯёЁ\\s]");
            Matcher punctuationMatcher = punctiationPattern.matcher(line);

            while (punctuationMatcher.find()) {
                punct++;
            }

        }
        return punct;
    }

    private static int getWordsCount(ArrayList<String> arr) {
        int wordsCount = 0;
        for (String line : arr) {
            Pattern wordsPattern = Pattern.compile("[а-яА-ЯёЁ]+");
            Matcher wordsMatcher = wordsPattern.matcher(line);

            while (wordsMatcher.find()) {
                wordsCount++;
            }

        }
        return wordsCount;
    }

    private static ArrayList<String> extractArrayOfLines(String path) {
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                if(line.contains("...")){
                    line = line.replace("...", ".");
                }
                arr.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

}
