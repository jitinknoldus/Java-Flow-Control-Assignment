package Flow_of_Control_Assignment.task2;

import java.util.Scanner;

//functionality to check the largest of 3 numbers

public class LargestOfThreeNumbers {
    static int largestOfThreeNumbers(int number1, int number2, int number3){
        if(number1>number2){
            if(number1 > number3){
                return number1;
            }else{
                return number3;
            }
        } else if (number2 > number1) {
            if(number2>number3){
                return number2;
            }else{
                return number3;
            }
        }else{
            return number3;
        }
    }


    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the 3 numbers");
        int number1 = scannerObject.nextInt();
        int number2 = scannerObject.nextInt();
        int number3 = scannerObject.nextInt();

        int largestNumber = largestOfThreeNumbers(number1, number2, number3);
        System.out.println("The largest number is: " + largestNumber);

    }


}
