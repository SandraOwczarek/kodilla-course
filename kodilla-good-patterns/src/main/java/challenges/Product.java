package challenges;

public class Product {
    private final String nameOfProduct;
    private final int quantityOfProduct;
    private final double priceOfProduct;

    public Product(String nameOfProduct, int quantityOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.priceOfProduct = priceOfProduct;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
    public double getPrice() {
        return priceOfProduct;
    }
}