package by.it.romanova.at04;


public class TaskC {
    public static void main(String[] args) {
        Task4();

        Task5();

    }

    public static void Task4() {
        System.out.println("\nTask 4");
        double y = 0;
        for (double j = 0; j <= 2; j += 0.2) {
            for (int i = 1; i < 7; i++) {

                y = y + Math.pow(7, j) - Math.cos(i);
            }
            System.out.printf("При a = %1.1f y = %-3.5f%n", j, y);


        }
    }

    public static void Task5() {
        System.out.println("\nTask 5");
        double b = 0;
        double a = 0;
        for (double i = -5.5; i < 2; i+=0.5) {
            if((i/2>-2)&&(i/2<=-1)){
                b = Math.sin(i*i);
                a = Math.log10(b + 2.74);
                System.out.printf("При x/2=%1.2f a=%1.6f%n",i/2,a);
            }
            else if ((i/2>-1)&&(i/2<0.2)) {
                b = Math.cos(i*i);
                a = Math.log10(Math.abs(b) + 2.74);
                System.out.printf("При x/2=%1.2f a=%1.6f%n",i/2,a);
            }
            else if (i/2==0.2){
                b = Math.cos(i*i)/Math.sin(i*i);
                a = Math.log10(Math.abs(b) + 2.74);
                System.out.printf("При x/2=%1.2f a=%1.6f%n",i/2,a);
            }
            else {
                System.out.println("error");
            }
        }
    }
}
