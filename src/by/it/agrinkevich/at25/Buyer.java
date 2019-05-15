package by.it.agrinkevich.at25;

import java.util.HashMap;

public class Buyer extends Thread implements IBuyer, IUseBasket {

    HashMap<String, Integer> hmap = new HashMap<>();


    Buyer(long number) {
        super("Buyer № " + number + " ");
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + "enter to Market");
    }

    @Override
    public void takeBasket() {
        System.out.println(this + "started to take baskets ");
        int timeout = Util.random(100, 200);
        System.out.println(this + "wait " + timeout + " seconds");
        Util.sleep(timeout);
        System.out.println(this + "finished to take baskets ");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this + "started to choose goods ");
        int timeout = Util.random(500, 2000);
        System.out.println(this + "wait " + timeout + " seconds");
        Util.sleep(timeout);
        System.out.println(this + "finished to choose goods ");
    }

    @Override
    public void putGoodsToBasket() {
        System.out.println(this + "started to put goods to basket ");
        int timeout = Util.random(100, 200);
        System.out.println(this + "wait " + timeout + " seconds");
        Util.sleep(timeout);
        System.out.println(this + "finished to put goods to basket ");
    }

    @Override
    public void goOut() {
        System.out.println(this + "out from the Market");
        Dispatcher.buyerCounter--;
    }

    @Override
    public String toString() {
        return getName();
    }
}
