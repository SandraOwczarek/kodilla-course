package challenges;

public class Message implements HelpDesk {
    @Override
    public void sendMessage(User user) {
        System.out.println("Send e-mail to: "+user.getName()+" "+user.getSurname());
    }
}