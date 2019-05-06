package by.it.okoyro.at05;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
	private static String[] words = {};
	private static int[] wordsRepetitions = {};

	private static int indexOfWordInArray(String word) {
		for (int i = 0; i < words.length; i++) {   // перебор массива слов words для определния совпадений
			if (words[i].equals(word)) {
				return i;
			}
		}
		return -1; // it's not existing index, start from 0 
	}

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
		Matcher matcher = pattern.matcher(Poem.text);
		while (matcher.find()) {
			String word = matcher.group();
			int wordIndex = indexOfWordInArray(word);
			if (wordIndex == -1) {
				words = Arrays.copyOf(words, words.length + 1);
				words[words.length - 1] = word;
				wordsRepetitions = Arrays.copyOf(wordsRepetitions, wordsRepetitions.length + 1);
				wordsRepetitions[wordsRepetitions.length - 1] = 1;
			}
			else {
				wordsRepetitions[wordIndex]++;
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + "=" + wordsRepetitions[i]);
		}
	}
}
