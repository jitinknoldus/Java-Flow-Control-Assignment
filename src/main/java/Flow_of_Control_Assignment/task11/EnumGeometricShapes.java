package Flow_of_Control_Assignment.task11;

//functionality to print area of shapes of Enum class

import java.awt.*;

enum GeometricShapes{
    Rectangle,
    Square,
    Circle;

    static void area(int a, int b){
        System.out.println("Area of rectangle is: " + a*b);
    }

    static void area(int a){
        System.out.println("Area of square is: " + a*a);
    }

}

public class EnumGeometricShapes {

    public static void main(String[] args) {
        GeometricShapes.area(4);
        GeometricShapes.area(4,5);
    }
}
