package by.it.tsyhanova.at12;

import java.io.*;

public class TaskB {
    /**
     *
     * @param cl наименование класса, на основании которого будет выстраиваться путь
     * @return возвращает путь
     */

    //формируем путь к файлу
    private static String dir(Class<?> cl){
        String path=System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String clDir=cl.getName().replace(cl.getSimpleName(),"").replace(".",File.separator);
        return path+clDir;
    }

    public static void main(String[] args) {
        String path=dir(TaskB.class);
        /*
        создаем StringBuilder для хранения текста из файла
         */
        StringBuilder sb=new StringBuilder();
        try (FileReader reader = new FileReader(path+"TaskB.java")) {
            // читаем посимвольно и сохраняем в StringBuffer
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char)c);
                //System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



        /*
        преобразовываем StringBuilder в строку методом toString()
         */
        String str=sb.toString();
        //System.out.println(str);


        boolean flag=false;
        String newStr="";
        //удаление однострочных комментариев
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)=='/') && (str.charAt(i+1)=='/')){
                flag=true;
            }
            if((flag)&&(str.charAt(i)=='\n')){
                flag=false;
            }
            if(!flag) {
                newStr = newStr + str.charAt(i);
            }
        }
        String newStr2="";
        for(int i=0;i<newStr.length()-2;i++){
            if(((newStr.charAt(i)=='/') && (newStr.charAt(i+1)=='*'))|
                    ((newStr.charAt(i)=='/') && (newStr.charAt(i+1)=='*') && (newStr.charAt(i+2)=='*'))
            ){
               flag=true;
            }
            if((flag) && (newStr.charAt(i)=='*') && (newStr.charAt(i+1)=='/')){
                flag=false;
                i=i+2;
            }
            if(!flag) {
                newStr2 = newStr2 + newStr.charAt(i);
            }
        }
        System.out.println(newStr2);

        try (FileWriter fw=new FileWriter(path+"TaskB.txt");
             PrintWriter txt=new PrintWriter(fw))
        {
            txt.println(newStr2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
