package design_patterns.factory.car;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("driving car gracefully");
    }
}
