

import java.util.Scanner;

public class WeekDayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String week = sc.nextLine().toLowerCase();

        if (week.equals("monday") || week.equals("tuesday") ||
            week.equals("wednesday") || week.equals("thursday") ||
            week.equals("friday")) {

            System.out.println("Weekday");

        } else if (week.equals("saturday") || week.equals("sunday")) {

            System.out.println("Weekend");

        } else {
            System.out.println("Not Valid");
        }

        sc.close();
    }
}
