package solid.lsp.order_management;

public class InStoreOrder extends Order {

    InStoreOrder() {
        super();
    }

    @Override
    public void placeOrder() {
        // Add specific logic for placing an in-store order
        System.out.println("Placing in-store order with ID: " + orderId);
        // Additional logic such as printing receipt, inventory check, etc.
    }

    @Override
    public void cancelOrder() {
        // Add specific logic for cancelling an in-store order
        System.out.println("Cancelling in-store order with ID: " + orderId);
        // Additional logic such as restocking items, updating inventory, etc.
    }
}
