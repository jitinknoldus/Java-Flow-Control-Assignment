package Flow_of_Control_Assignment.task3;
import java.util.Scanner;

// functionality to check whether the given year is leap year or not
public class CheckLeapYear {
    
    static Boolean checkLeapYear(int year){

        //checking if the year is divisible by 4
        if(year%4 == 0){

            //checking if the year is a century year
            if(year%100 == 0){


                //if the year is century year it should be divisible by 400 to be a leap year
                if(year%400 == 0){
                    return true;
                }else{
                    return false;
                }
            }

            return true;
        }

        return false;
    }
    
    
    
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.println("Enter the year to be checked ");
        int year = scannerObject.nextInt();
        
        Boolean result = checkLeapYear(year);

        if(result){
            System.out.println("The year: "+ year + " is a leap year");
        }else{
            System.out.println("The year: "+ year + " is not a leap year");
        }
        
    }
}
