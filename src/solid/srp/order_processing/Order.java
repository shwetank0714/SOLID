package solid.srp.order_processing;

import java.util.List;

public class Order {

    private List<Item> orderItems;
    private Customer customerInfo;
    private OrderStatus orderStatus;
    private int orderId;

    private static int randCount = 0;

    Order(List<Item> orderItems, Customer customerInfo, OrderStatus orderStatus){
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.customerInfo = customerInfo;
        this.orderId = randCount+1;

        randCount += 7;
    }

    // Implement getters here

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }
}

