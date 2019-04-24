package by.it.tsyhanova.at11;

import java.io.*;

public class TaskB {
    private static String dir(Class<?> cl){
        String path=System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String clDir=cl.getName().replace(cl.getSimpleName(),"").replace(".",File.separator);
        return path+clDir;
    }


    public static void main(String[] args) {
       //String sep=System.getProperty("file.separator");
        //String path = System.getProperty("user.dir") + sep+"src"+sep+"by"+sep+"it"+sep+"tsyhanova"+sep+"at11"+sep;
        String path=dir(TaskB.class);
        StringBuilder sb=new StringBuilder();
        try (FileReader reader = new FileReader(path+"text.txt")) {
            // читаем посимвольно  сохраняем в StringBuffer
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char)c);
                //System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        char[] symb={'-',',','.',':',';','(',')','?','!','—'};

        int marks=0;
        String str = sb.toString();
        str = str.replaceAll("([.]{3})+",". ");
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j < symb.length; j++) {
                char curStr=str.charAt(i);
                if(curStr==symb[j]){
                    marks++;
                }
            }

        }

        //с помощью regex даляем из строки все небуквенные символы, кроме апострофа.
        // Дефис и тире записываем в начале либо в конце регулярного выражения
        int words=0;
        str = str.replaceAll("([-,.:;()?! /\\\"0-9\\t\\n\\r^\\s*$—])+", " ");
        for (String element : str.split(" ")) {
                words++;
        }
        //System.out.println(str);
        System.out.println("words="+words+" punctuation marks="+marks);



        try (FileWriter fw=new FileWriter(path+"resultTaskB.txt");
             PrintWriter txt=new PrintWriter(fw))
        {
            txt.println("words="+words+" punctuation marks="+marks);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}


