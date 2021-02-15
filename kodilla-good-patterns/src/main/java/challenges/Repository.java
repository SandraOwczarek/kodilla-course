package challenges;

public class Repository implements OrderRepository{
    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println("Saved order: "+orderRequest.getProduct().getNameOfProduct()+", "+orderRequest.getProduct().getQuantityOfProduct()+" quantity, "+orderRequest.getProduct().getPrice() +"PLN for: "+orderRequest.getUser()+" "+orderRequest.getUser().getSurname());
    }
}
