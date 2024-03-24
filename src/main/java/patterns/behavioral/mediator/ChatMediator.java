package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatMediator implements Mediator {
    private final List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
