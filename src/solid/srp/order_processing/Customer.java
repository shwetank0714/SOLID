package solid.srp.order_processing;

public class Customer {
    String name;
    String address;
    int phoneNo;
    boolean isSubscriber;

    Customer(String name, String address, int phoneNo, boolean isSubscriber){
        this.address = address;
        this.name = name;
        this.phoneNo = phoneNo;
        this.isSubscriber = isSubscriber;
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getPhoneNo(){
        return this.phoneNo;
    }
    public boolean isSubscriber(){
        return this.isSubscriber;
    }

}
