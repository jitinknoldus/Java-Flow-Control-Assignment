package Flow_of_Control_Assignment.task11;

//functionality to print area of shapes of Enum class

import java.awt.*;
import java.util.Scanner;

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
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter 1 to print Area of rectangle");
        System.out.println("Enter 2 to print Area of Square");
        int userChoice = scannerObject.nextInt();

        switch(userChoice){
            case 1:
                System.out.println("Enter Length of rectangle");
                int lengthOfRectangle = scannerObject.nextInt();
                System.out.println("Enter Breadth of rectangle");
                int breadthOfRectangle = scannerObject.nextInt();
                GeometricShapes.area(lengthOfRectangle,breadthOfRectangle);
                break;

            case 2:
                System.out.println("Enter Length of rectangle");
                int sideOfSquare = scannerObject.nextInt();
                GeometricShapes.area(sideOfSquare);
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }

    }
}
