package by.it.romanova.at25;

public class Runner {
    public static void main(String[] args) {
        int buyercounter = 0;
        for (int i = 0; i < 5; i++) {
           // Util.sleep(1000);
            Buyer buyer = new Buyer(buyercounter);
            buyer.start();
            buyercounter++;
        }

    }


}

