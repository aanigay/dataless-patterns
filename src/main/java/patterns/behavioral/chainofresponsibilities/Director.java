package patterns.behavioral.chainofresponsibilities;

import java.util.Random;

public class Director implements Approver {
    private static final double APPROVAL_CHANCE = 0.7;
    private Approver nextApprover;

    private boolean isOk(double amount) {
        Random rand = new Random();
        return rand.nextDouble() <= APPROVAL_CHANCE;
    }
    @Override
    public void process(PurchaseRequest request) {
        if (isOk(request.getAmount())) {
            System.out.println("Director approves");
            return;
        }
        if (nextApprover != null) {
            nextApprover.process(request);
            return;
        }
        System.out.println("Director cannot approve");
    }

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
