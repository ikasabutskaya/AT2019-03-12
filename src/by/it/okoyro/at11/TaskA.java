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
	private static String dir(Class<?> cl) {
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;    //File.separator для получения
		//		уникальеого разделтиеля вместо "/" для Linux и "\\" для Windows
		String clDir = cl.getName().replace(cl.getSimpleName(), "").replace(".", File.separator);
		return path + clDir;

	}

	public static void main(String[] args) {
		//		String path = System.getProperty("user.dir") + "/src/by/it/okoyro/at11/";    //File.separator can be used
		List<Integer> list = new ArrayList<>();

		writeInt();
		readInt(list);
		printInt(list);
	}

	private static void printInt(List<Integer> list) {
		try (PrintWriter out = new PrintWriter(new FileWriter(dir(TaskA.class) + "resultTaskA.txt"))) {

			double sum = 0;
			for (Integer element : list) {
				System.out.println(element + " ");
				sum = sum + element;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readInt(List<Integer> list) {
		try (FileInputStream fis = new FileInputStream(dir(TaskA.class) + "resultTaskA.txt");
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 DataInputStream dis = new DataInputStream(bis)) {
			while (dis.available() > 0) {
				list.add(dis.readInt());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeInt() {
		try (FileOutputStream fos = new FileOutputStream(dir(TaskA.class) + "resultTaskA.txt");
			 BufferedOutputStream bos = new BufferedOutputStream(fos);
			 DataOutputStream dos = new DataOutputStream(bos)) {
			for (int i = 0; i < 20; i++) {
				int value = (int) (Math.random() * 100);
				dos.writeInt(value);
			}
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
