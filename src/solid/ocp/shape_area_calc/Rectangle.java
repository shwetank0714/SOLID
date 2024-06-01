package solid.ocp.shape_area_calc;

public class Rectangle implements Shape{
    private int length;
    private int breadth;
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }


    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int calculateArea() {
        return length*breadth;
    }
}
