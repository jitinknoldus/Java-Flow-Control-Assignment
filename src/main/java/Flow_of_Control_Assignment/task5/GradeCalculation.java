package Flow_of_Control_Assignment.task5;

import java.util.Scanner;

//functionality t decide the grade of student on the basis of marks
public class GradeCalculation {

    static Character gradeCalculation(float marks){
        if(marks>95.0){
            return 'S';
        } else if (marks > 90 && marks<95) {
            return 'A';
        } else if (marks > 80 && marks<90) {
            return 'B';
        } else if (marks > 70 && marks<80) {
            return 'C';
        } else if (marks > 50 && marks<70) {
            return 'D';
        }else{
            return 'F';
        }
    }


    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the marks");
        float marks = scannerObject.nextFloat();

        Character grade = gradeCalculation(marks);
        System.out.println(grade +  " grade");
    }
}
