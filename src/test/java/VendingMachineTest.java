import coins.Coin;
import machine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static coins.CoinType.TWENTY;
import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin1;

    @Before
    public void before() {
        vendingMachine = new VendingMachine();
        coin1 = new Coin(TWENTY);
    }

    @Test
    public void canAddCoinToVendingMachine() {
        vendingMachine.addCoin(coin1);
        assertEquals(1,vendingMachine.countCoins());
    }

}
