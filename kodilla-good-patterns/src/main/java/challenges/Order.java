package challenges;

public class Order implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Requested Order : "+orderRequest.getProduct().getNameOfProduct()+", "+orderRequest.getProduct().getQuantityOfProduct()+" quantity, "+orderRequest.getProduct().getPrice() +"PLN for customer : "+orderRequest.getUser().getName()+" "+orderRequest.getUser().getSurname());
        return true;
    }
}