//Write a method to get the total amount in the Coin Return.

package machine;

import coins.Coin;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public int countCoins() {
        return this.coins.size();
    }

    public void addCoin(Coin coin) {
        this.coins.add(coin);
    }

    public double totalAmount() {
        double total = 0.00;
        for (int i = 0; i < this.countCoins(); i++) {
            total += this.coins.get(i).getValueFromEnum();
        }
        return total;
    }
}

