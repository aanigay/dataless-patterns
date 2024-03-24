package patterns.behavioral.observer;

public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("Something happened!");
    }
}
