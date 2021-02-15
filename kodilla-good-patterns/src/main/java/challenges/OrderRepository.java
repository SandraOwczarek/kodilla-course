package challenges;

import java.util.List;

public interface OrderRepository {

    void createSale(User user, Product product);

    void createOrder(User user, String name, int quantity);

    List<Product> getUserProduct(User user);
}