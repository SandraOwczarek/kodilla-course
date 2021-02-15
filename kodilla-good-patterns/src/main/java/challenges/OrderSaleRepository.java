package challenges;
import java.util.*;

public class OrderSaleRepository implements OrderRepository {

    private final Map<User, List<Product>> assortment = new HashMap<>();
    private final Map<User, List<Product>> order = new HashMap<>();
    @Override
    public void createSale(User user, Product product) {
        if (assortment.containsKey(user)) {
            assortment.get(user).add(product);
        } else {
            List<Product> items = new ArrayList<>();
            items.add(product);
            assortment.put(user, items);
        }
    }
    @Override
    public void createOrder(User user, String name, int quantity) {
        if (order.containsKey(user)) {
            List<Product> userOrder = order.get(user);
            addOrderToMap(user, userOrder, name, quantity);
        } else {
            List<Product> userOrder = new ArrayList<>();
            addOrderToMap(user, userOrder, name, quantity);
        }
    }
    private void addOrderToMap(User user, List<Product> userOrder, String name, int quantity) {
        assortment.values().stream()
                .flatMap(Collection::stream)
                .filter(item -> item.getName().equals(name))
                .findFirst().ifPresent(item -> userOrder.add(new Product(name, item.getPrice(), quantity)));
        order.put(user, userOrder);
    }

    @Override
    public List<Product> getUserProduct(User user) {
        return order.get(user);
    }
}