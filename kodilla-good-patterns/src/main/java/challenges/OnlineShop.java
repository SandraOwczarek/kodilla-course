package challenges;

public class OnlineShop {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new Message(),new Order(),new Repository());
        productOrderService.process(orderRequest);
    }
}
