package Flow_of_Control_Assignment.task7;

import java.util.Scanner;

// functionality to print first n natural numbers
public class FirstnNaturalNumbers {

    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the count of numbers");
        int numberCount = scannerObject.nextInt();

        int index = 1;
        while(index<=numberCount){
            System.out.print(index + " ");
            index += 1;
        }


    }

}
