package by.it.romanova.at25;

class Util {

    static int random(int start, int stop){
        return (int)(Math.random()*(stop - start +1 )) + start;
    }


    static void sleep (int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
