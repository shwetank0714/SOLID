package design_patterns.factory.car;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("driving bike gracefully");
    }
}
