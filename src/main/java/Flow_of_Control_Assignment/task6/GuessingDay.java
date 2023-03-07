package Flow_of_Control_Assignment.task6;

import java.util.Scanner;

// functionality to check the day with their respective numbers
public class GuessingDay {

    static String guessingDay(int dayCount){
        switch (dayCount){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Enter Valid Number";
        }
    }


    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number");
        int dayCount = scannerObject.nextInt();

        System.out.println(guessingDay(dayCount));
    }

}
