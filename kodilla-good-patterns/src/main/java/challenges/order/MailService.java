package challenges.order;

public class MailService implements InformationService {

    public void notify(User user) {
        System.out.println(user.getName() + user.getSurname()
                + " order blah blah blah.");
    }
}
