package design_patterns.astract_factory.payments.client;

import design_patterns.astract_factory.payments.factory.PaymentGatewayFactory;
import design_patterns.astract_factory.payments.gateway.PaymentGateway;

public class PaymentProcessor {
    private final PaymentGateway gateway;

    public PaymentProcessor(PaymentGatewayFactory factory) {
        this.gateway = factory.getPaymentGateway();
    }

    public void processPayment(int amount){
        this.gateway.processPayment(amount);
    }
}
