package by.it.romanova.at12;

import java.io.*;

/** комментирование
 * @author Liza
 *
 * документации */

public class TaskB {
    // однострочный комментарий;
    // еще один однострочный комментарий;
    /* многостр
    очный
     комментарий */
    private static final String
            MULTILINE_START = "\u002F\u002A",
            DOUBLE_SLASH = "\u002F\u002F",
            MULTILINE_END = "\u002A\u002F";


    public static void main(String[] args) {
        /* еще один многост
        р
        очн
        ый
     комментарий */

        String srcFilePath = "/Users/elizabeth/AT2019-03-12/src/by/it/romanova/at12/TaskB.java";
        String outFilePath = "/Users/elizabeth/AT2019-03-12/src/by/it/romanova/at12/TaskB.txt";

        StringBuilder str = readFile(srcFilePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFilePath))){
            bufferedWriter.write(str.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);

    }

    private static StringBuilder readFile(String srcFilePath) {
        StringBuilder str = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath))){

            String line;
            while ((line = bufferedReader.readLine()) != null){

                if (line.contains(MULTILINE_START)){
                    while (!(line.contains(MULTILINE_END))) {
                        line = bufferedReader.readLine();
                    }
                }
                //line = bufferedReader.readLine();
                else  if (!(line.contains(DOUBLE_SLASH)))
                    str.append(line).append("\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}