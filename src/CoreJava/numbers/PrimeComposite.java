package CoreJava.numbers;

import java.util.Scanner;

public class PrimeComposite {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // not prime
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true; // no divisor found => prime
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite.");
        }
        else if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is a composite number.");
        }

        input.close();
    }
}