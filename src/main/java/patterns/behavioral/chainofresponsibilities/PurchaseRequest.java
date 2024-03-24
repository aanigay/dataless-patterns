package patterns.behavioral.chainofresponsibilities;

public class PurchaseRequest {
    private final double amount;

    public PurchaseRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

