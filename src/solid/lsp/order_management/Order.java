package solid.lsp.order_management;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    protected String orderId;
    protected List<String> items;

    Order() {
        this.orderId = String.valueOf(Math.random());
        this.items = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public abstract void placeOrder();
    public abstract void cancelOrder();
}

