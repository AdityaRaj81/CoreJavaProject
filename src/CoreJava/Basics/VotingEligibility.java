package CoreJava.Basics;

import java.util.Scanner;

public class VotingEligibility {

    // Method using ternary operator
    public static String checkEligibility(int age) {
        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String result = checkEligibility(age);

        System.out.println(result);
    }
}
