package challenges;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products = new ArrayList<>();
    public Products() {
        this.initStoreItems();
    }
    public List<Product> getProducts() {
        return products;
    }
    public void initStoreItems() {
        String[] productNames = {"Jacket", "Trousers", "Skirt"};
        Double[] productPrice = {100.50, 60.00, 30.00};
        Integer[] stock = {5, 10, 15};
        for (int i = 0; i < productNames.length; i++) {
            this.products.add(new Product(i + 1, productNames[i], productPrice[i], stock[i]));
        }
    }
}
