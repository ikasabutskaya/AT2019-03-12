package by.it.okoyro.at05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
//	public static final char[] VOWELS = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
	//	public static final char[] CONSONANTS = new char[]{'n', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

	private static final String CONSONANTS = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
	private static final String VOWELS = "АаЯяЫыИиУуЮюЭэЕеЁёОо";

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
		Matcher matcher = pattern.matcher(Poem.text);
		while (matcher.find()) {
			String word = matcher.group();
			char first = word.charAt(0);
			char last = word.charAt(word.length() - 1);
			if (CONSONANTS.contains(String.valueOf(first))
				&& (VOWELS.contains(String.valueOf(last)))){
				System.out.println(word);
			}
		}
	}
}
