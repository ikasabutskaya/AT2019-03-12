package by.it.tsyhanova.at02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args){
        System.out.println("Введите произвольное число");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int myMas[][]=new int[n][n];
        System.out.println("\n"+"Первое задание");
        myMas=step1(n);
        System.out.println("");

        System.out.println("\n"+"Второе задание");
        int mySum=step2(myMas);
        System.out.println("");

        System.out.println("\n"+"Третье задание");
        int[][] res=step3(myMas);
        // распечатка полученного массива с удаленными строками и столбцами,
        // ранее содержащими элемент(ы) с наибольшим значением
        for(int[] row:res){
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] step3(int[][] arr) {
       // определение максимальноего значения элемента массива
        int max=arr[0][0];
        for(int[] row:arr){
            for(int element:row){
                if(element>max)
                    max=element;
            }
        }
        // создание булевых массивов с признаками удаляемых строк и столбцов
        boolean[] delRow=new boolean[arr.length];
        boolean[] delCol=new boolean[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==max){
                    delRow[i]=true;
                    delCol[j]=true;
                }
            }
        }
        // определяем размер итоговой матрицы
        int rowCount=0;
        for(boolean del:delRow) if(!del) rowCount++;
        int colCount=0;
        for(boolean del:delCol) if(!del) colCount++;

        int[][] res=new int[rowCount][colCount];
        int ires=0;
        for(int i=0;i<arr.length;i++){
            if(delRow[i]==false){
                int jres=0;
                for(int j=0;j<arr[i].length;j++){
                    if(delCol[j]==false){
                        res[ires][jres]=arr[i][j];
                        jres++;
                    }
                }
                ires++;
            }
        }
        return res;
    }

    private static int step2(int[][] arr) {
        //Метод использует уже созданнй массив из метода step1, который был возвращен в массив mymas при вызове метода step1
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            int diapason[]=new int[2];
            for(int j=0;j<arr[i].length;j++) {

                 if(arr[i][j]>0&&count<2) {
                     diapason[count] = j;
                     //Проверка правильности занесения значений диапазона
                     //System.out.println("line"+i+" diapason["+count+"]="+diapason[count]);
                     count++;
                 }
               //Проверка правильно вывода переданного массива
               //System.out.print(arr[i][j]+" ");
            }
            //Проверка правильности вывода диапазона
            for(int k=0;k<diapason.length;k++){
                //System.out.print("diapason["+k+"]="+diapason[k]+" ");
            }
            //System.out.println("");
            for(int d=diapason[0]+1;d<diapason[1];d++){
                sum=sum+arr[i][d];
            }
        }
        System.out.print("Сумма элементов исходной матрицы, расположенных между первым и вторым положительными элементами каждой строки = "+sum);
        System.out.println("");
        return sum;
    }


    public static int[][] step1(int n) {
        //При возврате массива метод должен иметь не void, а, например, int и соответствующую мерность
        int mas[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              int num=(int)(Math.random()*(2*n+1)-n);
              mas[i][j]=num;
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("");
        }
        return mas;
    }
}
