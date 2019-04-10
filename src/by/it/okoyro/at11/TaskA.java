package by.it.okoyro.at11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskA {
	private static String getDirOfCurrentClass(Class<?> currentClassName) {
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
		/* File.separator для получения уникального разделтиеля вместо "/" для Linux и "\\" для Windows
	     System.getProperty("user.dir") + "/src/";  also works for Linux(MacOS) */
		String classDirectory = currentClassName.getName().replace(currentClassName.getSimpleName(), "")
				.replace(".", File.separator);
		return path + classDirectory;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(getDirOfCurrentClass(TaskA.class));
		writeInt();
		readInt(list);
		printInt(list);
	}

	private static void writeInt() {
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(getDirOfCurrentClass(TaskA.class) + "dataTaskA.bin")))) {

			for (int i = 0; i < 20; i++) {
				dos.writeInt((int) (Math.random() * 100));
			}
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void readInt(List<Integer> list) {
		try (DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(getDirOfCurrentClass(TaskA.class) + "dataTaskA.bin")))) {

			//			double sum = 0;
			//			double quantity = 0;
			while (dis.available() > 0) {
				//				dis.readInt();
				list.add(dis.readInt());
				//				System.out.print(i);
				//				sum = sum + i;
				//				quantity++;
			}
			//			System.out.print("avg= " + sum / quantity);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printInt(List<Integer> list) {
		try (PrintWriter out = new PrintWriter(
				new FileWriter(getDirOfCurrentClass(TaskA.class) + "resultTaskA.txt"))) {

			double sum = 0;
			double quantity = 0;

			for (Integer element : list) {
				System.out.print(element + " ");
				sum = sum + element;
				quantity++;
			}
			System.out.print("\navg=" + sum / quantity);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
