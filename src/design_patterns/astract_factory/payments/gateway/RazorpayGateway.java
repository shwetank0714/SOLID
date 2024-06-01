package design_patterns.astract_factory.payments.gateway;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("processing payment through razor pay");
    }
}
