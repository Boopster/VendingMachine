import machine.Drawer;
import org.junit.Before;
import org.junit.Test;
import products.Product;
import products.Sweet;

import static junit.framework.TestCase.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Sweet sweet;

    @Before
    public void before() {
        drawer = new Drawer();
        sweet = new Sweet("Mars Bar","Mars");
    }

    @Test
    public void canAddProductToDrawer(){
        drawer.addProduct(sweet);
        assertEquals(1, drawer.countProducts());
    }

}
