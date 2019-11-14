package coins;

public class Coin {

    private CoinType coin;

    public Coin(CoinType coin) {
        this.coin = coin;
    }

    public CoinType getCoin() {
        return this.coin;
    }

    public int getValueFromEnum() {
        return this.coin.getValue();
    }

}
