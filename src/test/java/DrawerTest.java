import machine.Drawer;
import org.junit.Before;
import org.junit.Test;
import products.Sweet;
import products.Crisp;
import products.Drink;

import static junit.framework.TestCase.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Sweet sweet;
    Crisp crisp;
    Drink drink;

    @Before
    public void before() {
        drawer = new Drawer();
        sweet = new Sweet("Mars Bar","Mars");
        crisp = new Crisp("Salt and Vinegar", "Walkers");
        drink = new Drink("Fanta", "The Coca-Cola Co");
    }

    @Test
    public void canAddProductToDrawer(){
        drawer.addProduct(sweet);
        assertEquals(1, drawer.countProducts());
    }

    @Test
    public void canRemoveProductFromDrawer(){
        drawer.addProduct(sweet);
        drawer.addProduct(sweet);
        drawer.removeProduct();
        assertEquals(1, drawer.countProducts());
    }

}
