package patterns.behavioral.chainofresponsibilities;

// Client
public class Client {
    public static void main(String[] args) {
        // Handlers
        Approver manager = new Manager();
        Approver director = new Director();

        // Set up the chain of responsibility
        manager.setNext(director);

        // Create requests
        PurchaseRequest request1 = new PurchaseRequest(500);
        PurchaseRequest request2 = new PurchaseRequest(2500);
        PurchaseRequest request3 = new PurchaseRequest(7000);

        // Processing
        manager.process(request1);
        manager.process(request2);
        manager.process(request3);
    }
}
