package by.it.vshchur.at12;

import java.io.*;

public class TaskB {
    /** @author Vitali Shchur */
    // однострочный коммент №1
    /*много-
    строчный комментарий №1
     */
    public static void main(String[] args) {
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
//                System.out.print((char) charNum);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void writeSource(StringBuilder sb, String sourceTextFilename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(sourceTextFilename))) {
            boolean oneRowComment = false;
            boolean multiLineComment=false;
            int i = 0;
            while (i < sb.length()-1) {
                if (sb.charAt(i)=='/' && sb.charAt(i+1)=='/') {
                    oneRowComment = true;
                    sb.delete(i, i+1);
                    if (i>0) i--;
                }
                if (oneRowComment && sb.charAt(i+1)=='\n') {
                    sb.deleteCharAt(i);
                    oneRowComment=false;
                    if (i>0)i--;
                }
                if (oneRowComment && sb.charAt(i)!='\n')
                {
                    sb.deleteCharAt(i);
                    if (i>0)i--;
                }

                if (sb.charAt(i)=='/' && sb.charAt(i+1)=='*') {
                    multiLineComment = true;
                    sb.delete(i, i+1);
                    if (i>0) i--;
                }

                if (multiLineComment && sb.charAt(i)=='*' && sb.charAt(i+1)=='/') {
                    sb.delete(i, i+1);
                    multiLineComment=false;
                    if (i>0)i--;
                }
                if (multiLineComment && sb.charAt(i)!='*' && sb.charAt(i+1)!='/') {
                    sb.deleteCharAt(i);
                    if (i>0)i--;
                }

                if (i<sb.length()) out.print(sb.charAt(i));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // однострочный коммент №2
    /*много-
    строчный комментарий №2
     */
}
