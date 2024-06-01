package design_patterns.astract_factory.payments.factory;

import design_patterns.astract_factory.payments.gateway.PaymentGateway;
import design_patterns.astract_factory.payments.gateway.StripeGateway;

public class StripeFactory implements PaymentGatewayFactory{
    @Override
    public PaymentGateway getPaymentGateway() {
        return new StripeGateway();
    }
}
