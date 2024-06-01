package design_patterns.factory.car;

public class VehicleFactory {

    public static Vehicle getVehicle(Category c) {
        if (c == Category.CAR) {
            return new Car();
        } else if (c == Category.BIKE) {
            return new Bike();
        } else {
            return null;
        }
    }
}
