import coins.Coin;
import machine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static coins.CoinType.*;
import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;

    @Before
    public void before() {
        vendingMachine = new VendingMachine();
        coin1 = new Coin(TWENTY);
        coin2= new Coin(ONE);
        coin3 = new Coin(FIVE);
        coin4 = new Coin(TWO);
    }

    @Test
    public void canAddCoinToVendingMachine() {
        vendingMachine.addCoin(coin1);
        assertEquals(1,vendingMachine.countCoins());
    }

    @Test
    public void canRejectInvalidCoins() {
        vendingMachine.addCoin(coin1);
        vendingMachine.addCoin(coin2);
        vendingMachine.addCoin(coin3);
        vendingMachine.addCoin(coin4);
        assertEquals(2,vendingMachine.countCoins());
    }

}
