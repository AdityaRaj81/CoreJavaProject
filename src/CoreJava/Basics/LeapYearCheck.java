package CoreJava.Basics;

import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {          // Step 1: divisible by 4?
            if (year % 100 == 0) {    // Step 2: divisible by 100?
                if (year % 400 == 0) { // Step 3: divisible by 400?
                    return true;       // yes → leap year
                } else {
                    return false;      // no → not a leap year
                }
            } else {
                return true;           // divisible by 4 but NOT by 100 → leap year
            }
        } else {
            return false;              // not divisible by 4 → not a leap year
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
