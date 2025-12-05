package CoreJava.numbers;

import java.util.Scanner;

public class HappyNumber {
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int num) {
        int count = 0;
        while (num != 1 && count < 100) {
            num = sumOfSquares(num);
            count++;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a Happy number.");
        } else {
            System.out.println(num + " is a Sad number.");
        }
        input.close();
    }
}
