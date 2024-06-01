package design_patterns.astract_factory.payments.gateway;

public class PaypalGateway implements PaymentGateway {
    public void processPayment(int amount){
        System.out.println("processing payment through paypal");
    }
}
