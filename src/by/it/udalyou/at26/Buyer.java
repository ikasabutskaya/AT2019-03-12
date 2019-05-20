package by.it.udalyou.at26;

public class Buyer extends Thread implements IBuyer {

    Buyer(long namber){
        super("Byer №"+namber+" ");
    }

    @Override
    public void run() {
        enterToMarket();
        takeBacket();
        chooseGoods();
        putGoodsToBacket();
        addToQueue();
        goOut();
    }



    @Override
    public void enterToMarket() {
        System.out.println(this+" enter to the Market");

    }

    @Override
    public void chooseGoods() {
        System.out.println(this+" started to choose goods");
        int timeOut = Util.random(200, 5000);
        System.out.println(this+"weit "+ timeOut+"seconds ");
        Util.sleep(timeOut);
        System.out.println(this+" stoped to choose goods");
    }

    @Override
    public void goOut() {
        System.out.println(this+" go out from the Market");
      //  Dispetcher.buyerCounter--;
        Dispetcher.buyerOut();
    }

    @Override
    public void takeBacket() {
        int timeOut = Util.random(100, 200);
        Util.sleep(timeOut);
        System.out.println(this+" take the backet");
    }

    @Override
    public void putGoodsToBacket() {
        int timeOut = Util.random(100, 200);
        Util.sleep(timeOut);
        System.out.println(this+" put doods in the backet");
    }

    @Override
    public void addToQueue() {
        QueueBuyers.add(this);
        synchronized (this){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        return getName();
    }

}
