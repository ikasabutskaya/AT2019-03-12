package by.it.agrinkevich.at12;
import java.io.*;

public class TaskB {
    public static void main(String[] args) {
        String filename = System.getProperty("user.dir")+
                "/src/by/it/agrinkevich/at12/TaskB.java"; // это строка
        StringBuilder sb = new StringBuilder();
        readCodeLines(filename, sb); // вызов функции
        saveCode(filename, sb);
    }

    private static void saveCode(String filename, StringBuilder sb) {
        try(FileWriter fw=new FileWriter(System.getProperty("user.dir")+"/src/by/it/agrinkevich/at12/TaskB.txt");
            PrintWriter pw=new PrintWriter(fw))
        {
            pw.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param filename путь к текущему джава файлу
     */
    private static void readCodeLines(String filename, StringBuilder sb) {
        /*
        первый и
        второй
        комментарии
        */
        try(BufferedReader fr = new BufferedReader(new FileReader(filename)))
        {
            boolean isMultipleComment = false;
            while (true){
                String line = fr.readLine();
                if (line == null) break;
                int indexOfComment1 = line.indexOf("//");
                int indexOfComment2 = line.indexOf("/*");
                int indexOfComment3 = line.indexOf("*/");

                if (indexOfComment2 != -1) {
                    isMultipleComment = true;
                    continue;
                }

                if (indexOfComment3 != -1) {
                    isMultipleComment = false;
                    continue;
                }

                if (isMultipleComment)
                    continue;

                if (indexOfComment1 == -1)
                    sb.append(line).append("\n");
                else {
                    sb.append(line.substring(0, indexOfComment1)).append("\n");
                }
            }
            /*
            пять
            шесть
            семь
            */
            System.out.println(sb);
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
