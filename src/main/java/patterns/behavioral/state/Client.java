package patterns.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(); // State A handling request
        context.request(); // State B handling request
        context.request(); // State A handling request
    }
}
