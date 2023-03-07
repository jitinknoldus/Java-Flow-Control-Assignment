package Flow_of_Control_Assignment.task1;

import java.util.Scanner;

//functionality to check whether the number is even or odd1
public class CheckEvenOdd {
    static Boolean checkEvenOdd(int userInput){
        if(userInput%2 == 0){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter number to be checked");
        int userInput = scannerObject.nextInt();

        Boolean result = checkEvenOdd(userInput);

        if(result){
            System.out.println("The number " + userInput + " is even");
        }else{
            System.out.println("The number " + userInput + " is odd");
        }

    }
}
