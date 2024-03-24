package patterns.behavioral.state;

public class StateB implements State {
    public void handleRequest(Context context) {
        System.out.println("State B.");
        // Transition
        context.setState(new StateA());
    }
}
