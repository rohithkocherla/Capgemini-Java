package Day3;

import java.util.Scanner;

public class WeekDayFind {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Week: ");
        String week = sc.nextLine();

        if(week.equals("Monday") ||week.equals("Tuesday") ||week.equals("Wed") ||week.equals("Thur") ||week.equals("Fri" )){
            System.out.println("Weekday");
        }
        else if(week.equals("Saturday")||week.equals("Sunday")){
            System.out.println("Weeekend");
        }
        else{
            System.out.println("Not Valid");
        }
    }
    
}
