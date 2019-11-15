//Create a Vending Machine class with a list of drawers, list of coins entered and coin return.

package machine;

import coins.Coin;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coins;
    private CoinReturn coinReturn;

    public VendingMachine() {
        this.drawers = new ArrayList<Drawer>();
        this.coins = new ArrayList<Coin>();
        this.coinReturn = new CoinReturn();
    }

    public void addCoin(Coin coin) {
        if (coin.getValueFromEnum() > 0.04) {
            this.coins.add(coin);
        } else {
            this.coinReturn.addCoin(coin);
        }
    }

    public int countCoins() {
        return this.coins.size();
    }

    public double getTotalCoinReturn(){
        return this.coinReturn.totalAmount();
    }

}
