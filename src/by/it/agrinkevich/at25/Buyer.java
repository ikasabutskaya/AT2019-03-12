package by.it.agrinkevich.at25;

public class Buyer extends Thread implements IBuyer {

    Buyer(long number){
        super("Buyer № "+number+" ");
    }


    @Override
    public void run() {
        super.run();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this+"Enter to Market ");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this+"Start to choose goods ");
        int timeout = Util.random(500, 2000);
        System.out.println(this+"wait"+timeout+"seconds");

        System.out.println(this+"Finished to choose goods ");
    }

    @Override
    public void goOut() {
        System.out.println(this+"out dtom the Market");
        Dispatcher.buyerCounter--;
    }

    @Override
    public String toString(){
        return getName();
    }
}
