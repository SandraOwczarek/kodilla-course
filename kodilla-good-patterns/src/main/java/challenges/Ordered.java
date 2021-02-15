package challenges;

public class Ordered {
    public User user;
    public boolean isOrdered;

    public Ordered(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
    public User getUser() {
        return user;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
}