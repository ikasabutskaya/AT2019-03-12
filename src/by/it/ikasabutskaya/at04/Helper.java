package by.it.ikasabutskaya.at04;

public class Helper {
    // это класс, необходимый для задания 3 уровня сложности В или С, еще не делала
    static void sort(double[] a) {
        for (int last = a.length-1; last > 1; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i+1]) {
                    double buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;

                }
            }
        }
    }
}
