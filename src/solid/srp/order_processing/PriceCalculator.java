package solid.srp.order_processing;

import java.util.List;

public class PriceCalculator {
    public double calculateOrderPrice(List<Item> orderItems){
        double totalPrice = 0;
        for(Item it: orderItems){
            totalPrice += it.getPrice();
        }
        return totalPrice;
    }
}
