package challenges;

public interface HelpDesk {
    void inform(User user, Product product);
    void informAboutOrder(User user, String name, int quantity);
}
