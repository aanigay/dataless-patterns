package patterns.behavioral.state;

public class StateA implements State {
    public void handleRequest(Context context) {
        System.out.println("State A.");

        // Transition
        context.setState(new StateB());
    }
}
