//Create a Drawer class with a Enum code (A1, B1, ETC), price and a list of Products. (One product type per drawer but could swap out for any other product)
//Add methods to add a product to drawer and return product from drawer.
package machine;

import products.Product;

import java.util.ArrayList;

public class Drawer {

    private DrawerCode code;
    private double price;
    private ArrayList<Product> items;

    public Drawer(){
        this.code = code;
        this.price = price;
        this.items = new ArrayList<Product>();
    }

    public DrawerCode getCode() {
        return code;
    }

    public void setCode(DrawerCode code) {
        this.code = code;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int countProducts() {
        return this.items.size();
    }

    public void addProduct(Product product) {
        this.items.add(product);
    }

}
