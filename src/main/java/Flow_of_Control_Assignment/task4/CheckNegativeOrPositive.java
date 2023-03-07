package Flow_of_Control_Assignment.task4;

import java.util.Scanner;

//functionality to check the input number is 0, negative or positive
public class CheckNegativeOrPositive {
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scannerObject.nextInt();

        if(number==0){
            System.out.println("The number is 0");
        } else if (number<0) {
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is positve");
        }
    }
}
