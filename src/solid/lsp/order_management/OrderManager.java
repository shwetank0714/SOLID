package solid.lsp.order_management;

public class OrderManager {

    public void processOrder(Order order) {
        order.placeOrder();
    }

    public void reverseOrder(Order order) {
        order.cancelOrder();
    }

    public static void main(String[] args) {
        Order onlineOrder = new OnlineOrder();
        onlineOrder.addItem("Laptop");
        onlineOrder.addItem("Mouse");

        Order inStoreOrder = new InStoreOrder();
        inStoreOrder.addItem("Book");
        inStoreOrder.addItem("Pen");

        Order phoneOrder = new PhoneOrder();
        phoneOrder.addItem("Phone Case");
        phoneOrder.addItem("Charger");

        OrderManager manager = new OrderManager();
        manager.processOrder(onlineOrder);
        manager.reverseOrder(onlineOrder);

        manager.processOrder(inStoreOrder);
        manager.reverseOrder(inStoreOrder);

        manager.processOrder(phoneOrder);
        manager.reverseOrder(phoneOrder);
    }
}
