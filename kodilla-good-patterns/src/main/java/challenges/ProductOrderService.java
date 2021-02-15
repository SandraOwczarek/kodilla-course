package challenges;

public class ProductOrderService {

    private HelpDesk helpDesk;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderService(HelpDesk helpDesk, OrderService orderService, OrderRepository orderRepository) {
        this.helpDesk = helpDesk;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public Ordered process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            helpDesk.sendMessage(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new Ordered(orderRequest.getUser(), true);
        } else return new Ordered(orderRequest.getUser(), false);
    }
}