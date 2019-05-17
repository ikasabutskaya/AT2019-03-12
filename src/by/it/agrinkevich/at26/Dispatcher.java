package by.it.agrinkevich.at26;

class Dispatcher {
    static final int K_SPEED = 50;
    private static volatile int buyerCounter = 0;
    private static volatile int buyerInShop = 0;
    private static final int PLAN=100;

    synchronized static boolean marketIsClosed(){
        return buyerCounter>=PLAN &&
                buyerInShop==0;
    }

    synchronized static boolean marketOpened(){
        return buyerCounter<PLAN;
    }

    synchronized static int buyerIn(){
        buyerCounter++;
        buyerInShop++;

        return buyerCounter;
    }

    synchronized static void buyerOut(){
        buyerInShop--;
    }
}
