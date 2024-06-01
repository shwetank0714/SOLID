package solid.lsp.order_management;

public class PhoneOrder extends Order {

    PhoneOrder() {
        super();
    }

    @Override
    public void placeOrder() {
        // Add specific logic for placing a phone order
        System.out.println("Placing phone order with ID: " + orderId);
        // Additional logic such as taking customer details, confirming order verbally, etc.
    }

    @Override
    public void cancelOrder() {
        // Add specific logic for cancelling a phone order
        System.out.println("Cancelling phone order with ID: " + orderId);
        // Additional logic such as notifying customer via phone, updating records, etc.
    }
}
