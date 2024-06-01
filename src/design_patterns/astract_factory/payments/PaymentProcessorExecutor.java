package design_patterns.astract_factory.payments;

import design_patterns.astract_factory.payments.client.PaymentProcessor;
import design_patterns.astract_factory.payments.factory.PaymentGatewayFactory;
import design_patterns.astract_factory.payments.factory.PaypalFactory;
import design_patterns.astract_factory.payments.factory.RazorpayFactory;
import design_patterns.astract_factory.payments.factory.StripeFactory;

import java.util.ArrayList;
import java.util.Collection;

public class PaymentProcessorExecutor {
    public static void main(String[] args) {
        PaymentGatewayFactory stripeFact = new StripeFactory();
        PaymentGatewayFactory paypalFact = new PaypalFactory();
        PaymentGatewayFactory razorFact = new RazorpayFactory();

        PaymentProcessor p1 = new PaymentProcessor(stripeFact);
        PaymentProcessor p2 = new PaymentProcessor(paypalFact);
        PaymentProcessor p3 = new PaymentProcessor(razorFact);

        Collection<PaymentProcessor> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);


        for (PaymentProcessor p: list){
            double a = Math.random()/5;
            p.processPayment((int)a);
        }

    }
}
