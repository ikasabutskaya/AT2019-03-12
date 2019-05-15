package by.it.agrinkevich.at25;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Buyer> buyers=new ArrayList<>();

        System.out.println("Market opened");
        int buyerCounter=0;
        for (int time=0; time<120; ++time) {
            Util.sleep(1000);
            int count=Util.random(2);
            for (int i=0; i<=count; ++i){
                Buyer buyer = new Buyer(++buyerCounter);
                buyers.add(buyer);
                buyer.start();
            }
        }
        /*for (Buyer buyer:
             ) {

        }*/
        System.out.println("Market closed");
    }

}
