package patterns.behavioral.chainofresponsibilities;

public class Manager implements Approver {
    private static final double APPROVAL_AMOUNT = 1000;
    private Approver nextApprover;

    private boolean isOk(double amount) {
        return amount < APPROVAL_AMOUNT;
    }
    @Override
    public void process(PurchaseRequest request) {
        if (isOk(request.getAmount())) {
            System.out.println("Manager approves");
            return;
        }
        if (nextApprover != null) {
            nextApprover.process(request);
            return;
        }
        System.out.println("Manager cannot approve");
    }

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
