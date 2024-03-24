package patterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        Observer display = new ConcreteObserver();

        concreteSubject.registerObserver(display);
        concreteSubject.notifyObservers();
    }
}
