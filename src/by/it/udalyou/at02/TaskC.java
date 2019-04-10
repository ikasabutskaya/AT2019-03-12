package by.it.udalyou.at02;


import java.util.Scanner;


public class TaskC {

    //   В классе TaskC один раз введите с консоли n через объект типа Scanner
    //   - размерность матрицы mas[n] [n] и вызовите из метода main статические
    //   методы step1 step2 step3 с указанной сигнатурой:


    public static <n> void main(String[] args) {
        System.out.println("Введите число n для создания массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        int[][] array = new int[n][n];
        //  1.Задать значения элементов матрицы в интервале значений от -n до n с помощью
        //  генератора случайных чисел. Числа целые. Тип int. Пока в матрице нет
        //  чисел n и -n генерацию следует повторять, иначе вывести матрицу в консоль,
        //  а затем, вернуть полученную матрицу. Сигнатура int[ ][ ] step1(int n).
        array=step1(n);

        int sum=step2(array);

        int[][] arr = step3(array);

        //При выводе результатов в консоль отделяйте элементы строк одиночными пробелами,
        // а сами строки -переносами \n
        for (int[] row : arr) {
            for (int element : row) {
                System.out.printf("%3d ", element);
            }
            System.out.println();

        }
    }
    //3.Найти максимальный элемент(ы) в матрице и удалить из исходнойматрицы все строки
    // и столбцы, его содержащие.Вывести в консоль и вернуть полученную матрицу.
    // Сигнатураint[ ][ ] step3(int[ ][ ] mas).
    private static int[][] step3(int[][] array) {


        int max=array[0][0];
        for (int[] row : array) {
            for (int element : row) {
                if (element>max) max=element;
                            }
        }
        System.out.println("Максимальный элемент= "+max);

       boolean[]delstr=new boolean[array.length];
       boolean[]delcol=new boolean[array[0].length];
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]==max){
                    delcol[j]=true;
                    delstr[i]=true;
                }
            }
        }
    int str=0;
    int col=0;
    for (boolean b :delstr)
        if (!b)str++;
     for (boolean b:delcol)
         if(!b)col++;
         int[][]arr=new int[str][col];
         int iarr=0;
        for (int i=0;i<array.length;i++) {
            if (!delstr[i]) {
                int jarr = 0;

                for (int j = 0; j < array[i].length; j++) {
                    if (!delcol[j]) {
                        arr[iarr][jarr] = array[i][j];
                        jarr++;
                    }
                }
                iarr++;
            }
        }
        return arr;
    }

    //Найти, вывести и вернуть сумму элементов исходной матрицы mas,
// расположенных между первым и вторым положительными элементами каждой строки.
// Сигнатура int step2(int[ ][ ] mas).

    private static int step2(int[][] array) {

        int sum=0;
     for ( int i=0;i<array.length;i++) {
         int st[] = new int [2];//[array[i].length];
         int kn=0;
         for (int j=0;j<array[i].length;j++) {

    if (array[i][j]>0&&kn<2) {
       st[kn] = j;
       kn++;
   }
       }
       for (int a=0;a<st.length;a++){
            }
      for (int d=st[0]+1;d<st[1];d++) {
           sum = sum + array[i][d];
        }
       }
         System.out.println("Сумма элементов матрицы в заданных диапазонах: "+sum);
     return sum;
    }

    private static int[][] step1(int n) {
int arr[][]=new int[n][n];

            boolean minus = false;
            boolean plus = false;

            while (!(minus&&plus)){
                minus = false;
                plus = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() *( n * 2 + 1)) - n;
                    if (!minus&&arr[i][j] == -n)
                    minus = true;
                    if (!plus&&arr[i][j] == n)
                   plus = true;
                }
            }

        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.printf("%3d ", element);
            }
            System.out.println();

        }
         return arr;
    }


}

