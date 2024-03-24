package patterns.behavioral.state;

public class Context {
    private State state;

    public Context() {
        // Set the initial state
        this.state = new StateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}
