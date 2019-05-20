package by.it.romanova.at27;

class Dispatcher {

    static final int K_SPEED=100;

    private static final int PLAN = 8;
    private static volatile int buyerCounter=0;
    private static volatile int buyerInShop=0;

    static synchronized boolean marketOpened(){
        return buyerCounter<PLAN;
    }

    static synchronized boolean marketClosed(){
        return (buyerCounter >= PLAN) && (buyerInShop == 0);

    }

    static synchronized int buyerIn(){
        buyerCounter++;
        buyerInShop++;
        return buyerCounter;
    }

    static synchronized void buyerOut(){
        buyerInShop--;
    }



}