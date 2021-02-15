package challenges;

public class ProductOrderService {
    private final HelpDesk helpDesk;
    private final OrderService orderService;
    public ProductOrderService(HelpDesk helpDesk,
                               OrderService orderService) {
        this.helpDesk = helpDesk;
        this.orderService = orderService;
    }
    public void process(final OrderRequest orderRequest) {
        orderService.createSell(orderRequest.getUser(), orderRequest.getItem());
        helpDesk.inform(orderRequest.getUser(), orderRequest.getItem());
    }
}