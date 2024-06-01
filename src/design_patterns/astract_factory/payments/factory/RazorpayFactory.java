package design_patterns.astract_factory.payments.factory;

import design_patterns.astract_factory.payments.gateway.PaymentGateway;
import design_patterns.astract_factory.payments.gateway.RazorpayGateway;

public class RazorpayFactory implements PaymentGatewayFactory{
    @Override
    public PaymentGateway getPaymentGateway() {
        return new RazorpayGateway();
    }
}
