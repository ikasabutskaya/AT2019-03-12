package by.it.agrinkevich.at04;

public class TaskC {
    public static void main(String[] args) {
        funC1();
        System.out.println();
        funC2();
    }

    private static void funC1() {
        double a = 0;
        double y =0;
        while (a >= 0 && a <= 2){
            for (int i = 1; i < 7; i++) {
                y = y + (Math.pow(7, a) - Math.cos(i));
            }
            System.out.println("y = " + y);
            a = a + 0.2;
            y = 0;
        }
    }

    private static void funC2() {
        double step = 0.5;
        double b = 0;
        double x = -6 + step; // увеличиваю переменную на шаг, поскольку в условии задается строгое неравество
        while (x > -6 && x < 2 ){
            if (x/2 > -2 && x/2 <= -1){
                b = Math.log10(Math.abs((Math.sin(x*x) + 2.74)));
                System.out.println("При x/2=" + x/2 + ", a=" + b);
            }
            else if (x/2 > -1 && x/2 < 0.2){
                b = Math.log10(Math.abs((Math.cos(x*x) + 2.74)));
                System.out.println("При x/2=" + x/2 + ", a=" + b);
            }
            else if (x/2 == 0.2){
                b = Math.log10(Math.abs(((Math.cos(x*x) + 2.74))/(Math.sin(x*x) + 2.74)));
                System.out.println("При x/2=" + x/2 + ", a=" + b);
            }
            else
                System.out.println("При x/2=" + x/2 +" вычисления не определены");
            x = x + step;
            b = 0;
        }
    }
}
