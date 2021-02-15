package challenges;

public class MailService implements HelpDesk {
    @Override
    public void inform(User user, Product product) {
        System.out.println("Welcome in our shop " + user.getName() + "!");
        System.out.println("In Your basket there is/are: " + product.getName() +
                " which will cost you : " + product.getPrice() + " PLN ");
    }
    @Override
    public void informAboutOrder(User user, String name, int quantity) {
        System.out.println("We created new order for: " + user.getName() + "products: " + name + "in amount of: " + quantity);
    }
}