package CoreJava.numbers;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseTheNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit
            number /= 10; // Remove the last digit
        }

        return reversedNumber;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = input.nextInt();
        System.out.println("Reversed Number: " + reverseTheNumber(num));
        input.close();
    }
}
