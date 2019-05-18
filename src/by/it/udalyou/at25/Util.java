package by.it.udalyou.at25;

import java.util.Random;

class Util {

    private Util() {
    }
private static Random rnd=new Random();
    static int random (int start, int stop){
        //return (int) (Math.random()*(stop-start-1))+start;
        int delta=(stop-start);
        return rnd.nextInt(delta)+start;
}
static int random(int max){
    return random(0,max);
}
    static void sleep(int timeOut) {
        try {
            Thread.sleep(timeOut/Dispetcher.K_SPEED);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
