package by.it.vshchur.at12;
/** @author Vitali Shchur */
import java.io.*;

public class TaskB {
    // однострочный коммент №1

    public static void main(String[] args) {
    /*много-
    строчный комментарий №1
     */
        StringBuilder sbTaskB = new StringBuilder();
        String sourceJavaFilename = System.getProperty("user.dir") +
                "/src/by/it/vshchur/at12/TaskB.java";
        String sourceTextFilename = System.getProperty("user.dir") +
                "/src/by/it/vshchur/at12/TaskB.txt";

        readSource(sbTaskB, sourceJavaFilename);
        writeSource(sbTaskB, sourceTextFilename);
    }

    private static void readSource(StringBuilder sb, String sourceJavaFilename) {
        try (FileReader reader = new FileReader(sourceJavaFilename)) {
            // читаем посимвольно и сохраняем в StringBuffer
            int charNum;
            while ((charNum = reader.read()) != -1) {
                sb.append((char) charNum);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void writeSource(StringBuilder sb, String sourceTextFilename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(sourceTextFilename))) {
            boolean isOneLineComment = false;
            boolean isMultiLineComment = false;
            int i = 0;
            while (i < sb.length() - 1) {
                if (sb.charAt(i)=='/'&& sb.charAt(i+1)=='*'){
                    while (!(sb.charAt(i)=='*'&& sb.charAt(i+1)=='/')){
                        sb.deleteCharAt(i);
                    }
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                }

                if (sb.charAt(i)=='/'&& sb.charAt(i+1)=='/'){
                    while (!(sb.charAt(i)=='\n')){
                        sb.deleteCharAt(i);
                    }
 //                   sb.deleteCharAt(i);
                }
                if (i < sb.length()) out.print(sb.charAt(i));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            // однострочный коммент №2
        }
    }
    /*много-
    строчный комментарий №2
     */
}
