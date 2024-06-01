package solid.lsp.order_management;

public class OnlineOrder extends Order {

    OnlineOrder() {
        super();
    }

    @Override
    public void placeOrder() {
        // Add specific logic for placing an online order
        System.out.println("Placing online order with ID: " + orderId);
        // Additional logic such as payment processing, sending confirmation email, etc.
    }

    @Override
    public void cancelOrder() {
        // Add specific logic for cancelling an online order
        System.out.println("Cancelling online order with ID: " + orderId);
        // Additional logic such as refund processing, notifying customer, etc.
    }
}
