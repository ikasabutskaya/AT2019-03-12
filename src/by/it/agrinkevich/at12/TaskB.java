package by.it.agrinkevich.at12;

import java.io.*;

public class TaskB {
    public static void main(String[] args) {
        String filename = System.getProperty("user.dir") +
                "/src/by/it/agrinkevich/at12/TaskB.java"; // это строка
        StringBuilder sb = new StringBuilder();
        readCodeLines(filename, sb); // вызов функции
        saveCode(filename, sb);
    }

    private static void saveCode(String filename, StringBuilder sb) {
        try (FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/by/it/agrinkevich/at12/TaskB.txt");
             PrintWriter pw = new PrintWriter(fw)) {
            pw.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /**
    * @param filename путь к текущему джава файлу
    **/
    private static void readCodeLines(String filename, StringBuilder sb) {
        /*
        первый и
        второй
        комментарии
        */
        try (BufferedReader fr = new BufferedReader(new FileReader(filename))) {
            boolean isMultipleComment = false;
            while (true) {
                String line = fr.readLine();
                if (line == null) break;
                int indexOfComment1;
                int indexOfComment2;
                int indexOfComment3;


                int slashIndex = line.lastIndexOf("/");
                if (slashIndex == -1) {
                    indexOfComment3 = -1;
                    indexOfComment2 = -1;
                    indexOfComment1 = -1;
                } else {
                    char beforeSlashChar = line.charAt(slashIndex - 1);
                    if (beforeSlashChar == '*') {
                        indexOfComment3 = slashIndex - 1;
                        indexOfComment2 = -1;
                        indexOfComment1 = -1;
                    } else if(beforeSlashChar == '/'){
                        indexOfComment3 = -1;
                        indexOfComment2 = -1;
                        indexOfComment1 = slashIndex-1;
                    } else {
                        indexOfComment1 = -1;
                        indexOfComment3 = -1;
                        char afterSlashChar = line.charAt(slashIndex + 1);
                        if (afterSlashChar == '*') {
                            indexOfComment2 = slashIndex;
                        } else {
                            indexOfComment2 = -1;
                        }
                    }
                }


                if (indexOfComment2 != -1) {
                    isMultipleComment = true;
                    sb.append(line.substring(0,indexOfComment2)).append("\n");
                    continue;
                }

                if (indexOfComment3 != -1) {
                    isMultipleComment = false;
                    continue;
                }

                if (isMultipleComment)
                    continue;

                if (indexOfComment1 == -1) {
                    sb.append(line).append("\n");
                } else {
                    sb.append(line.substring(0,indexOfComment1)).append("\n");
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
