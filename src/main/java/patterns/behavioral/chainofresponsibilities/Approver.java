package patterns.behavioral.chainofresponsibilities;

public interface Approver {
    void process(PurchaseRequest request);
    void setNext(Approver approver);
}
