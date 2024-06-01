package solid.ocp.shape_area_calc;

import java.util.List;

public class Area {

    public int areaCalculator(List<Shape> ls){
        int ans = 0;
        for(Shape s : ls){
            ans += s.calculateArea();
        }
        return ans;
    }
}
