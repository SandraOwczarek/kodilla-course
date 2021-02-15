package challenges;

import java.util.*;

public class OrderImpl implements OrderRepository {
    private final OrderRepository orderRepository;

    public SaleServiceImpl(OrderRepository saleRepository) {
        this.orderRepository = saleRepository;
    }

    @Override
    public void createSell(User user, Product product) {
        orderRepository.createSale(user, product);
    }

}}