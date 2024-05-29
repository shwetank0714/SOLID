package solid.srp.order_processing;

public class Item {
    private String name;
    private double price;
    private double weight;

    Item(String name, double price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Add getters setters here

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
