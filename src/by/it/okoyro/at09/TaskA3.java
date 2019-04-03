package by.it.okoyro.at09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		String s;
		int pozZero = 0; //задаем место для 0 по нулевому индексу
		while (!(s = sc.next()).equals("end")) {
			Integer i = Integer.valueOf(s);
			if (i > 0) {
				list.add(pozZero++, i);
			}
			else if (i == 0) {
				list.add(pozZero, i);
			}
			else {
				list.add(i);
			}
		}
		System.out.println(list);
	}
}


//		for (; ; ) {
//			String s = sc.next();
//			if (s.equals("end")) {
//				break;
//			}
//			Integer i = Integer.valueOf(s);
//			if (i < 0) {
//				list.add(i);
//			}
//			if (i == 0) {
//				list.add(pozZero, i); //0 ставим
//			}
//			else {
//				list.add(pozZero++, i); //так можно вставить число на место 0
//			}
//		}
//		System.out.println(list);
//	}
//}
