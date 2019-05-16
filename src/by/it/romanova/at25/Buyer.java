package by.it.romanova.at25;

public class Buyer extends Thread implements IBuyer{
    Buyer(long number){
        super("Buyer № " + number + " ");
    }


    @Override
    public void enterToMarket() {
        System.out.println(this.getName() + "entered the Market");
    }

    @Override
    public void chooseGoods() {

        System.out.println(this.getName() + "starts choosing goods");
        int timeout = Util.random(500,5000);
        Util.sleep(timeout);
        System.out.println(this.getName() + "stopped choosing goods");

    }

    @Override
    public void goOut() {
        System.out.println(this.getName() + "exit the Market");
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }
}
