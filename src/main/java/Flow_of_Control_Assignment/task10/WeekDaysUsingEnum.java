package Flow_of_Control_Assignment.task10;

import java.util.Scanner;

// functionality to print weekdays names using Enum class
public class WeekDaysUsingEnum {

    enum Weekdays{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    public static void main(String [] args){
        Scanner scannerObject = new Scanner(System.in);
        for(Weekdays index : Weekdays.values()){
            System.out.println(index);
        }

    }

}
