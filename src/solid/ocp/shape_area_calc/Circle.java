package solid.ocp.shape_area_calc;

public class Circle implements Shape{
    
    int radius;
    
    Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int calculateArea() {
        return (int)(3.14*radius*radius);
    }
}
