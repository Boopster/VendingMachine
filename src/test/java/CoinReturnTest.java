import coins.Coin;
import machine.CoinReturn;
import org.junit.Before;
import org.junit.Test;

import static coins.CoinType.*;
import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;
    Coin coin1;
    Coin coin2;
    Coin coin3;

    @Before
    public void before() {
        coinReturn = new CoinReturn();
        coin1 = new Coin(FIVE);
        coin2 = new Coin(TEN);
        coin3 = new Coin(TWENTY);
    }

    @Test
    public void canTotalCoinsToReturn() {
        coinReturn.addCoin(coin1);
        coinReturn.addCoin(coin2);
        coinReturn.addCoin(coin3);
        assertEquals(0.35,coinReturn.totalAmount(),0.1);
    }

}
