package challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Sandra", "Owczarek");
        Product product = new Product("Trousers", 1,300);

        return new OrderRequest(user,product);
    }

}
