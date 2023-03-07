package Flow_of_Control_Assignment.task8;


import java.util.Scanner;

// functionality to get sum of first n natural numbers
public class SumOfNaturalNumbers {

    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter count of numbers");
        int count = scannerObject.nextInt();

        int sumOfNumbers = 0;
        int index = 1;
        while(index<=count){
            sumOfNumbers += index;
            index += 1;
        }

        System.out.println("The sum is: " + sumOfNumbers);

    }
}
