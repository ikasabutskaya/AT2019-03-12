package by.it.okoyro.at09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskA1 {
	private List<Integer> grades = new ArrayList<>();

	public static void main(String[] args) {
		TaskA1 task = new TaskA1(); //метод clearBad нестатический по условию, значит нужно
		// создать экземпляр класса TaskA1
		for (int i = 0; i < 20; i++) {
			int grade = (int) Math.ceil((Math.random() * 10));
			task.grades.add(grade);
		}
		System.out.println("Before:" + task.grades);
		task.clearBad(task.grades);
		System.out.println("After:" + task.grades);

	}

	private void clearBad(List<Integer> grades) {
		Iterator<Integer> iterator = grades.iterator();
		while (iterator.hasNext()) {
			Integer grade = iterator.next();
			if (grade < 4) {
				iterator.remove();
			}
		}
	}
}
