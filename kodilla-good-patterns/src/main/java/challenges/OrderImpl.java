package challenges;

public class OrderImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createSell(User user, Product product) {
        orderRepository.createSale(user, product);
    }

}