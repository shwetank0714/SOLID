package solid.lsp.payment_processing;

public class PaymentProcessor {

    public void processPayment(PaymentMethod p, double amount){
        p.processPayment(amount);
    }
}
