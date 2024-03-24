package patterns.behavioral.mediator;

public interface Mediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
