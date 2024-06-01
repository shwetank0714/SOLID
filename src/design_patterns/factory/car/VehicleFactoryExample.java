package design_patterns.factory.car;

public class VehicleFactoryExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle(Category.CAR);
        car.drive();
    }
}
