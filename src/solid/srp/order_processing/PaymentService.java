package solid.srp.order_processing;

public class PaymentService {
    public void performOrderPayment(Order o){
        // payment processing
        System.out.println("Payment processed for order id: "+ o.getOrderId());
    }
}
