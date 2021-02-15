package challenges;

public class  OnlineShop {

    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest(new User("Sandra", "Owczarek", "monkey@monkey.com"),
                new Product("Trousers", 300, 1));
        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new OrderImpl(new OrderSaleRepository()));
        productOrderService.process(orderRequest);
    }
}