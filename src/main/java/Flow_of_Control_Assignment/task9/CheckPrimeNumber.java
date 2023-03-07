package Flow_of_Control_Assignment.task9;

import java.util.Scanner;


//functionality to check whether the number is prime or not
public class CheckPrimeNumber {

    static boolean checkPrimeNumber(int number){
        boolean flag = true;
        int index = 2;
        do{

            if(number==1){
                return false;
            }

            if(number == 2){
                return true;
            }


            if(number%index==0){
                flag = false;
                break;
            }
            index += 1;
        }while(index<= number/2);

        if(flag){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number to be checked");
        int number = scannerObject.nextInt();

        if(checkPrimeNumber(number)){
            System.out.println("The number: "+ number + " is prime number");
        }else{
            System.out.println("The number: "+ number + " is not a prime number");
        }
    }
}
