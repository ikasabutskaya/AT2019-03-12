package by.it.romanova.at25;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        List<Buyer> buyers = new ArrayList<>();

        int buyercounter = 0;
        for (int i = 0; i < 5; i++) {
           // Util.sleep(1000);
            Buyer buyer = new Buyer(buyercounter);
            buyers.add(buyer);
            buyer.start();
            buyercounter++;
        }

        for (Buyer buyer : buyers) {
            buyer.join();
        }


        System.out.println("Market closed");

    }


}

