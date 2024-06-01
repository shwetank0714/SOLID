package design_patterns.astract_factory.payments.gateway;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("processing payment through stripe");
    }
}
