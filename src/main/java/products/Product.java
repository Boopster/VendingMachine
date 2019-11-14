//Create a Product abstract class which has name and brand.

package products;

public abstract class Product {

    private String name;
    private String brand;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

}
