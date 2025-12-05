package CoreJava.numbers;

import java.util.Scanner;

public class XylemPhloemNumber {

    public static boolean isXylemNumber(int num) {

        int digitCount = 0;
        int temp = num;

        // Count total digits
        while (temp > 0) {
            digitCount++;
            temp = temp / 10;
        }

        // Extract first digit
        int firstDigit = num;
        for (int i = 1; i < digitCount; i++) {
            firstDigit = firstDigit / 10;
        }

        // Extract last digit
        int lastDigit = num % 10;

        // Sum of extreme digits (first + last)
        int extremeSum = firstDigit + lastDigit;

        // Sum of middle digits
        int middleSum = 0;
        temp = num / 10; // Remove last digit

        for (int i = 1; i < digitCount - 1; i++) {
            middleSum += temp % 10;
            temp = temp / 10;
        }

        return extremeSum == middleSum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isXylemNumber(num)) {
            System.out.println(num + " is a Xylem number.");
        } else {
            System.out.println(num + " is a Phloem number.");
        }

        input.close();
    }
}
