package by.it.okoyro.at09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA2 {
	public static void main(String[] args) {
		// это не полноценные массивы а массивы на интерфейсе
		//		List<Integer> integersA = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7);
		//		List<Integer> integersB = Arrays.asList(4, 5, 6, 7, 8, 8, 9, 10);
		//
		//		HashSet<Integer> a = new HashSet<>(integersA);
		//		TreeSet<Integer> b = new TreeSet<>(integersB); //сортированный

		HashSet<Integer> one = new HashSet<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7));
		TreeSet<Integer> two = new TreeSet<>(Arrays.asList(9, 8, 7, 6, 5, 5, 3, 7));

		System.out.println("One:" + one);
		System.out.println("Two:" + two);

		Set<Integer> union = getUnion(one, two);
		System.out.println("Union:" + union);

		Set<Integer> cross = getCross(one, two);
		System.out.println("Union:" + cross);
	}

	private static Set<Integer> getCross(Set<Integer> one, Set<Integer> two) {
		Set<Integer> result = new HashSet<>(one);
		result.retainAll(two);
		return result;
	}

	private static Set<Integer> getUnion(Set<Integer> one, Set<Integer> two) {
		Set<Integer> result = new HashSet<>(one);
		result.addAll(two);
		return result;
	}
}
