package design_patterns.astract_factory.payments.factory;

import design_patterns.astract_factory.payments.gateway.PaymentGateway;

public interface PaymentGatewayFactory {
    PaymentGateway getPaymentGateway();
}
